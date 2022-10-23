package com.elsevier.javaspringapi.service;

import com.elsevier.javaspringapi.dto.PatientDto;
import com.elsevier.javaspringapi.dto.PatientPatchDto;
import com.elsevier.javaspringapi.dto.mapper.DTOMapper;
import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.models.mapper.ModelMapper;
import com.elsevier.javaspringapi.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    private final DTOMapper dtoMapper;

    private final ModelMapper modelMapper;

    public PatientService(PatientRepository patientRepository, DTOMapper dtoMapper, ModelMapper modelMapper) {
        this.patientRepository = patientRepository;
        this.dtoMapper = dtoMapper;
        this.modelMapper = modelMapper;
    }

    public List<PatientDto> getAllPatients(boolean shouldMask) {
        List<Patient> patients = patientRepository.getPatients();
        return  patients.stream()
                .map(p -> dtoMapper.map(p, shouldMask))
                .collect(toList());
    }

    public PatientDto getPatient(UUID patientId, boolean shouldMask) {
        Patient patient = patientRepository.getPatient(patientId);
        return dtoMapper.map(patient, shouldMask);
    }

    public UUID createPatient(PatientDto patientDto) {
        Patient patient = modelMapper.map(patientDto);
        patientRepository.save(patient);
        return patient.getId();
    }

    public void updatePatient(UUID patientId, PatientPatchDto patientPatchDto) {
       Patient patient = patientRepository.getPatient(patientId);
        if (isNotBlank(patientPatchDto.getLastName())) {
            patient.setLastName(patientPatchDto.getLastName());
        }
        if (isNotBlank(patientPatchDto.getPhoneNumber())) {
            patient.setPhoneNumber(patientPatchDto.getPhoneNumber());
        }
    }

    public void deletePatient(UUID patientId) {
        patientRepository.delete(patientId);
    }
}
