import {Component} from 'react';

import DataSource from './Patient.datasource';
import PatientView from './Patient.view';

class PatientContainer extends Component {
  constructor(props) {
    super(props);

    this.state = {
      patient: null
    };
  }

  async componentDidMount() {
    const { data, error } = await DataSource.getPatientDemographicData(this.props.patientId)

    if (error) return;
    
    this.setState({
      patient: data
    });
  }

  render() {
        return (
            this.state.patient ?
                <PatientView patient={this.state.patient} /> :
                <div className="loading">Loading</div>
        );
  }
}

export default PatientContainer;