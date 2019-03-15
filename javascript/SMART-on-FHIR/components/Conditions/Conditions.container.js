import {Component} from 'react';
import DataSource from './Conditions.datasource';
import ConditionsView from './Conditions.view';

class ConditionsContainer extends Component {
  constructor(props) {
    super(props);

    this.state = {
      conditions: null,
      sort: { field: 'dateRecorded', desc: false }
    };
    this.onSortHandler = this.onSortHandler.bind(this);
  }

  sortConditions(conditions, {field, desc}) {
    if (field === 'dateRecorded') {
      return conditions.sort((a, b) => {
        const aDate = a.resource.dateRecorded ?
            new Date(a.resource.dateRecorded) :
            new Date('1970-01-01');
        const bDate = b.resource.dateRecorded ?
            new Date(b.resource.dateRecorded) :
            new Date('1970-01-01');

        if (aDate > bDate) return desc ? 1 : -1;
        if (aDate < bDate) return desc ? -1 : 1;
        return 0;
      });
    }

    if (field === 'text') {
      return conditions.sort((a, b) => {
        const aText = a.resource.code.text.toLowerCase();
        const bText = b.resource.code.text.toLowerCase();
        if (aText > bText) return desc ? -1 : 1;
        if (aText < bText) return desc ? 1 : -1;
        return 0;
      });
    }
  }

  onSortHandler(field) {
    const sort = this.state.sort;
    const nextSort = {field, desc: !sort.desc};
    const conditions = this.sortConditions(this.state.conditions, nextSort);

    this.setState({conditions, sort: nextSort});
  }

  async componentDidMount() {
    const { data, error } = await DataSource.getPatientConditionData(this.props.patientId);
    
    if (error) return;

    this.setState({
      conditions: this.sortConditions(data, this.state.sort)
    });
  }

  render() {
        return (
            this.state.conditions ?
                <ConditionsView
                    sort={this.state.sort}
                    onSort={this.onSortHandler}
                    conditions={this.state.conditions}
                  /> :
                <div className="loading">Loading</div>
        );
  }
}

export default ConditionsContainer;