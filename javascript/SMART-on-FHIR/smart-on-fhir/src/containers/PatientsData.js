import React, { Component } from "react";
import Patient from "../components/Patient.js";
import Condition from "../components/Condition.js";

class PatientsData extends Component {
  constructor(props) {
    super(props);
    this.state = {
      loading: true,
      selectedPatient: null,
      patients: [],
      conditions: []
    };
    this.toggleConditions = this.toggleConditions.bind(this);
    this.getPatients = this.getPatients.bind(this);
    this.getConditions = this.getConditions.bind(this);
  }

  componentDidMount() {
    this.getPatients()
    this.getConditions()
  }

  getPatients() {
    fetch('https://r2.smarthealthit.org/Patient')
    .then(response => response.json())
    .then(body => {
      this.setState({ patients: body.entry, loading: false})})
    .catch(error => console.error(`Error in fetch for Patients`))
  }


  getConditions() {
    fetch(`https://r2.smarthealthit.org/Condition`)
      .then(response => response.json())
      .then(body => {
        this.setState({ conditions: body.entry });
      })
      .catch(error => console.error(`Error in fetch for Conditions`));
  }

// Sets the ID of the patient
// I never actually got to implementing this or the handleClick function due to
// passing down data issue i was having

  toggleConditions(id) {
    if (id === this.state.selectedPatient) {
      this.setState({ selectedPatient: null });
    } else {
      this.setState({ selectedPatient: id });
    }
  }

  render() {
    if (this.state.loading) {
      return <div>Loading...</div>;
    }
    if (!this.state.patients.length) {
      return <div>There are no patients :(</div>;
    }

    var patientsData = this.state.patients.map(patient => {
      let selected;
      if (this.state.selectedPatient === patient.resource.id) {
        selected = true;
      }

      let handleClick = () => {
        this.toggleConditions(patient.resource.id);
      };

      return (
        <Patient
          key={patient.resource.id}
          patientId={patient.resource.id}
          name={
            patient.resource.name[0].given +
            ` ` +
            patient.resource.name[0].family
          }
          gender={patient.resource.gender}
          birthDate={patient.resource.birthDate}
          conditionsData={this.state.conditions}
          selected={selected}
          handleClick={handleClick}
          conditions={this.state.conditions}
        />
      );
    });

    return  (
    <div>
      <h1>Patients</h1>
       {patientsData}
    </div>
    )
  }
}
export default PatientsData;
