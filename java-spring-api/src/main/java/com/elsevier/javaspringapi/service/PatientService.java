package com.elsevier.javaspringapi.service;

import com.elsevier.javaspringapi.exception.PatientNotFoundException;
import com.elsevier.javaspringapi.models.Patient;

import java.util.List;
import java.util.UUID;

public interface PatientService {
    public List<Patient> fetchPatientList();

    public void savePatient(Patient patient);

    void deletePatientById(UUID id) throws PatientNotFoundException;

    Patient fetchPatientById(UUID id) throws PatientNotFoundException;

    void updatePatients(Patient patient, UUID id) throws PatientNotFoundException;
}
