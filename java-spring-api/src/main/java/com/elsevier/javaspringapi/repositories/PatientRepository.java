package com.elsevier.javaspringapi.repositories;

import com.elsevier.javaspringapi.models.Patient;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PatientRepository {
    // TODO: Once the patient model is complete add some test patients here, 3 should be fine.
    private List<Patient> patients = new ArrayList<>(){{
        add(new Patient());
        add(new Patient());
        add(new Patient());
    }};

    // TODO: Implement these methods

    public List<Patient> getPatients() {
        return null;
    }

    public Patient getPatient(UUID id) {
        return null;
    }

    public void save(Patient patient) {

    }

    public void delete(UUID id) {

    }
}
