import React, { Component } from 'react';

import './App.css';
import { getPatientInfo } from './API';

import PatientInfo from './PatientInfo';
import Spinner from './Spinner';
import Error from './Error';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      error: null,
      isSearching: false,
      patientInfo: null,
      patientId: ''
    };
  }

  componentDidMount() {
    if (window.location.hash) {
      this.searchPatient(window.location.hash.substr(1)); // strip initial # char
    }
  }

  onSubmit = (event) => {
    event.preventDefault();
    this.searchPatient(this.state.patientId);
  }

  searchPatient(patientId) {
    (async () => {
      patientId = patientId.replace(/\D/g, ''); // remove non-numeric chars
      if (patientId.length !== 7) {
        this.setState({ error: 'Please enter a valid numeric patient id (7 digits).' });
        return;
      }

    window.location.hash = patientId;
    this.setState({isSearching: true, error: null, patientId, patientInfo: null});
    try {
      const patientInfo = await getPatientInfo(patientId)
      this.setState({patientInfo, isSearching: false});
    }
    catch (error) {
      this.setState({error, isSearching: false});
    }
    })();
  }

  updatePatientId = (event) => {
    this.setState({
      patientId: event.target.value
    });
  }

  render() {
    const {error, isSearching, patientId, patientInfo} = this.state;

    return (
      <div className="App">
        <header className="app-header">
          Patient Search
        </header>
        <section>
          <form onSubmit={this.onSubmit}>
              <label className="input-label">Patient Id</label>
              <input value={patientId} onChange={this.updatePatientId} disabled={isSearching} placeholder="Please enter 7 digit patient id" />
              <input type="submit" value="Search" disabled={isSearching} />
            {isSearching && <Spinner>Searching for patient</Spinner>}
            {patientInfo && <PatientInfo patient={patientInfo} />}
            {error && <Error>{error}</Error>}
          </form>
        </section>
      </div>
    );
  }
}

export default App;