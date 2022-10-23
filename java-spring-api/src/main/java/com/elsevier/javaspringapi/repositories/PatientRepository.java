package com.elsevier.javaspringapi.repositories;

import com.elsevier.javaspringapi.exception.NotFoundException;
import com.elsevier.javaspringapi.exception.ObjectAlreadyExist;
import com.elsevier.javaspringapi.models.Patient;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static java.time.Month.AUGUST;
import static java.time.Month.NOVEMBER;
import static java.util.UUID.randomUUID;

@Repository
public class PatientRepository {
    private static final List<Patient> PATIENTS = new ArrayList<>();

    static {
        PATIENTS.add(Patient.builder().id(UUID.fromString("ac78b16f-59fa-4e75-9c92-c5c4a2daae8c")).lastName("Doe")
                .firstName("Jane").dob(LocalDate.of(1991, AUGUST, 31))
                .ssn("111-11-1111").phoneNumber("123-456-7890").build());
        PATIENTS.add(Patient.builder().id(UUID.fromString("ebad6e7a-48aa-416f-b3d2-6c15403a4e1d")).lastName("Doe")
                .firstName("John").dob(LocalDate.of(1991, NOVEMBER, 30))
                .ssn("222-22-2222").phoneNumber("098-765-4321").build());
    }

    public List<Patient> getPatients() {
        return PATIENTS;
    }

    public Patient getPatient(UUID id) {
        Optional<Patient> response = PATIENTS.stream().filter(patient -> patient.getId().equals(id)).findFirst();
        if (!response.isPresent()) throw new NotFoundException("Patient does not exist");
        return response.get();
    }

    public void save(Patient patient) {
        if (PATIENTS.contains(patient)) {
            throw new ObjectAlreadyExist("Object already exist with the ID: " + patient.getId());
        }
        PATIENTS.add(patient);
    }

    public void delete(UUID id) {
        Optional<Patient> response = PATIENTS.stream().filter(patient -> patient.getId().equals(id)).findFirst();
        if (!response.isPresent()) throw new NotFoundException("Patient does not exist");
        PATIENTS.remove(response.get());
    }
}
