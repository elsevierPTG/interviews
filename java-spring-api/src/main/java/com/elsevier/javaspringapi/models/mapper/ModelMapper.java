package com.elsevier.javaspringapi.models.mapper;

import com.elsevier.javaspringapi.dto.PatientDto;
import com.elsevier.javaspringapi.models.Patient;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ModelMapper {

    public Patient map(PatientDto patientDto) {
        return Patient.builder().firstName(patientDto.getFirstName())
                .lastName(patientDto.getLastName()).dob(patientDto.getDob())
                .ssn(patientDto.getSsn()).phoneNumber(patientDto.getPhoneNumber())
                .id(UUID.randomUUID()).build();
    }
}
