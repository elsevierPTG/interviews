package com.elsevier.javaspringapi.service;

import com.elsevier.javaspringapi.exception.PatientNotFoundException;
import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> fetchPatientList() {
        return patientRepository.getPatients();
    }

    @Override
    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deletePatientById(UUID id) throws PatientNotFoundException {
        if (!patientRepository.delete(id)) {
            throw new PatientNotFoundException("Patient Not Available to delete with Id:" + id);
        }
    }

    @Override
    public Patient fetchPatientById(UUID id) throws PatientNotFoundException {
        Optional<Patient> patient = null;
        try {
            patient = Optional.ofNullable(patientRepository.getPatient(id));
        } catch (Exception ex) {
            throw new PatientNotFoundException("Patient Not Available with Id:" + id);
        }
        return patient.get();
    }

    @Override
    public void updatePatients(Patient patient, UUID id) throws PatientNotFoundException {
        Patient newPatient = patientRepository.updatePatients(patient, id);
        if (!Objects.nonNull(newPatient)) {
            throw new PatientNotFoundException("Patient Not Available to update with Id:" + id);
        }
    }
}
