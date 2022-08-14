package com.elsevier.javaspringapi.repositories;

import com.elsevier.javaspringapi.models.Patient;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepository {

    private List<Patient> patients = new ArrayList<>() {{
        add(buildPatient("c0d475a7-5b66-484d-b2b1-ee6d6b16a58f", "Dave", "Bay", "123-45-6789", LocalDate.of(1990, 10, 9), "212-212-2202"));
        add(buildPatient("4bd95792-5c61-4425-aa4e-8d0a9746c837", "John", "Kay", "856-45-5000", LocalDate.of(1985, 3, 16), "312-312-3202"));
        add(buildPatient("8b0f14a2-efa4-4726-b956-e81f2aff114f", "Rick", "Way", "754-45-6000", LocalDate.of(1980, 5, 26), "412-412-4202"));
    }};

    public List<Patient> getPatients() {
        return patients;
    }

    public Optional<Patient> getPatient(UUID id) {

        return patients.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void save(Patient patient) {

        patients.add(patient);
    }

    public void delete(UUID id) {
        patients.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .ifPresent(p -> patients.remove(p));
    }

    private Patient buildPatient(String id, String firstName, String lastName, String ssn, LocalDate dob, String phoneNumber) {

        Patient patient = new Patient();
        patient.setId(UUID.fromString(id));
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setDob(Date.valueOf(dob));
        patient.setSsn(ssn);
        patient.setPhoneNumber(phoneNumber);
        return patient;
    }
}
