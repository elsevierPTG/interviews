import React, { Component } from "react";
import Condition from "./Condition";


class Patient extends Component {
  constructor(props) {
    super(props);
    this.state = {
    };

  }
// Passing the conditions down is where I had the most trouble this is not correct as is.
// I am checking here if the Patient matches the patint associated
// to each condition and displaying them under each one.

  render() {
    var conditionData = this.props.conditions.map(condition => {
        if (condition.resource.patient.reference === `Patient/${this.props.patientId}`) {
        return (
          <Condition
          key={condition.resource.id}
          id={condition.resource.id}
          patientID={condition.resource.patient.reference}
          onset={condition.resource.onsetDateTime}
          conditionName={condition.resource.code.text}
          />
        );
      }
  });
    return  (
        <div>
        <h4>Name: {this.props.name}</h4>
        <p>Gender: {this.props.gender}</p>
        <p>DOB: {this.props.birthDate}</p>
        {conditionData}
        </div>
        )
  }
}
export default Patient;
