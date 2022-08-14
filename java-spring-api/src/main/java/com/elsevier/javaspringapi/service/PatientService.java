package com.elsevier.javaspringapi.service;

import com.elsevier.javaspringapi.contract.PatientDto;
import com.elsevier.javaspringapi.contract.PatientPatchDto;
import com.elsevier.javaspringapi.exception.CustomException;
import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.repositories.PatientRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientModelConverter patientModelConverter;

    public List<PatientDto> getAllPatients(boolean deIdentify) {
        List<Patient> patients = patientRepository.getPatients();
        return patients.stream()
                .map(p -> patientModelConverter.convertModelToDto(p, deIdentify))
                .collect(Collectors.toList());
    }

    public PatientDto getPatient(UUID patientId, boolean deIdentify) {
        Optional<Patient> patientOptional = patientRepository.getPatient(patientId);
        Patient patient = patientOptional.orElseThrow(() -> new CustomException(HttpStatus.NOT_FOUND, "Patient info not found"));

        return patientModelConverter.convertModelToDto(patient, deIdentify);
    }

    public UUID createPatient(PatientDto patientDto) {

        if (patientRepository.getPatients().stream()
                .anyMatch(p -> p.getSsn().equals(patientDto.getSsn()))) {
            throw new CustomException(HttpStatus.BAD_REQUEST, "Patient already exists");
        }

        Patient patient = patientModelConverter.convertDtoToModel(patientDto);
        patientRepository.save(patient);
        return patient.getId();
    }

    public void updatePatient(UUID patientId, PatientPatchDto patientPatchDto) {

        Optional<Patient> patientOptional = patientRepository.getPatient(patientId);
        Patient patient = patientOptional
                .orElseThrow(() -> new CustomException(HttpStatus.BAD_REQUEST, "Patient info not found"));

        // Set Last name to Patient Model only if request has it
        if (StringUtils.hasText(patientPatchDto.getLastName())) {
            patient.setLastName(patientPatchDto.getLastName());
        }

        // Since phone number is not a required field in the Patient model, we should allow user to remove it
        if (StringUtils.hasText(patientPatchDto.getPhoneNumber())) {
            patient.setPhoneNumber(patientPatchDto.getPhoneNumber());
        } else {
            patient.setPhoneNumber(null);
        }
    }

    public void deletePatient(UUID patientId) {

        patientRepository.delete(patientId);
    }
}
