import React, { Component } from 'react';
import ReactTable from 'react-table';

import './PatientInfo.css';
import 'react-table/react-table.css';

import { getPatientConditions } from './API';
// import { capitalize } from './utils';
import Error from './Error';
import Spinner from './Spinner';
import * as moment from 'moment';
import * as capitalize from 'capitalize';

const COLUMNS = [
  { Header: 'Condition', accessor: (c) => c.resource.code.text, id: 'condition', Cell: props => <div style={{"text-align": "left"}}>{props.value}</div> },
  { Header: 'Date Recorded', accessor: (c) => c.resource.dateRecorded, id: 'dateRecorded', Cell: props => moment(props.value).format('LL') },
  { Header: 'PubMed', accessor: (c) => <PubMedLink condition={c} />, id: 'pubMed'}
];
const TABLE_PROPS = {
  columns: COLUMNS,
  className: 'patient-info-table',
  defaultSorted: [
    {id: 'dateRecorded', desc: true}
  ],
  noDataText: 'No patient conditions found.',
  defaultPageSize: 10
}

function PubMedLink({ condition }) {
  const conditionName = condition.resource.code.text;
  const url = `https://www.ncbi.nlm.nih.gov/pubmed/?term=${encodeURIComponent(conditionName)}`;
  return (
    <a href={url} target="_blank" rel="noopener noreferrer" title={`Search "${conditionName}" on PubMed`}>
      PubMed
    </a>
  );
}

function isConditionActive(condition) {
  return condition.resource.clinicalStatus === 'active';
}

class PatientInfo extends Component {
  constructor(props) {
    super(props);
    this.state = {isSearching: true, conditions: null};
  }

  componentDidMount() {
    (async () => {
        try {
            const conditions = await getPatientConditions(this.props.patient.id);
            const activeConditions = conditions.entry
            ? conditions.entry.filter(isConditionActive)
            : [];
            this.setState({conditions: activeConditions, isSearching: false})
        }
        catch (error) {
            this.setState({error, isSearching: false});
        }
    })();
  }

  render() {
    const { patient } = this.props;
    const { error, conditions, isSearching } = this.state;
    return (
      <div className="patient-info">
        <div className="patient-detail-info">
          <div>{capitalize.words(patient.name[0].text)} ({patient.id})</div>
          <div>Birth Date: {moment(patient.birthDate).format('LL')}</div>
          <div>Gender: {capitalize.words(patient.gender)}</div>
        </div>
        {isSearching && <Spinner>Getting patient conditions</Spinner>}
        {error && <Error>{error}</Error>}
        {conditions && (
          <ReactTable data={conditions} {...TABLE_PROPS} />
        )}
      </div>
    )
  }
}

export default PatientInfo;