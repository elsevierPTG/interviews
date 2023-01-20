package com.elsevier.javaspringapi.repositories;

import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.util.PatientUtils;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Repository
public class PatientRepository {

    // TODO: Once the patient model is complete add some test patients here, 3 should be fine.

    private List<Patient> patients = new ArrayList<>() {{
        try {
            add(new Patient(UUID.fromString("4ced7ec1-0048-4907-a871-d93bfb933ece"), "Rakesh", "Singha", PatientUtils.generateDate("01-01-1900"), "SSN", "123-321-3456"));
            add(new Patient(UUID.fromString("2742971e-175f-41cd-a7d7-70d74eb70f30"), "Amit", "Kar", PatientUtils.generateDate("01-01-1980"), "SSN", "123-321-3456"));
            add(new Patient(UUID.fromString("fb61d092-953c-4c72-b382-205377d4c9ea"), "Pramod", "Das", PatientUtils.generateDate("01-01-2020"), "SSN", "123-321-3456"));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }};

    // TODO: Implement these methods

    public List<Patient> getPatients() {
        return patients;
    }

    public Patient getPatient(UUID id) {
        return patients.stream().filter(patient -> patient.getId().equals(id)).findFirst().get();
    }

    public void save(Patient patient) {
        Patient newPatient = new Patient();
        newPatient.setId(patient.getId());
        newPatient.setFirstName(patient.getFirstName());
        newPatient.setLastName(patient.getLastName());
        newPatient.setDob(patient.getDob());
        newPatient.setSsn(patient.getSsn());
        newPatient.setPhoneNumber(patient.getPhoneNumber());
        patients.add(newPatient);
    }

    public boolean delete(UUID id) {
        return patients.removeIf(patient -> patient.getId().equals(id));
    }

    public Patient updatePatients(Patient patient, UUID id) {
        for (Patient patients : patients) {
            if (patients.getId().equals(id)) {
                patients.setFirstName(patient.getFirstName());
                patients.setId(patient.getId());
                patients.setFirstName(patient.getLastName());
                return patients;
            }
        }
        return null;
    }


}
