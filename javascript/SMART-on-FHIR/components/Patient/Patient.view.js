function PatientView({patient}) {
  return (
    <div>
        <div className="patient">
        <h4 className="patient_title">Patient Info</h4>
            <ul className="patient_name">
                <li>Name: {patient.name}</li>
                <li>Gender: {patient.gender}</li>
                <li>Birth Date: {patient.birthDate}</li>
            </ul>
        </div>
        <style jsx>{`
            .patient {
                margin-bottom: 10px; 
            }
            
            .patient_title {
                margin-bottom: 10px;
                color: #0076ff;
            }

            .patient_name > li {
                margin-bottom: 5px;
            }
        `}</style>
    </div>);
}

export default PatientView;