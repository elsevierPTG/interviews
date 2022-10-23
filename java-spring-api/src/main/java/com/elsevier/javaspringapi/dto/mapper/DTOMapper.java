package com.elsevier.javaspringapi.dto.mapper;

import com.elsevier.javaspringapi.dto.PatientDto;
import com.elsevier.javaspringapi.models.Patient;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
public class DTOMapper {
    public PatientDto map(Patient patient, boolean shouldMask) {
        return PatientDto.builder().firstName(patient.getFirstName()).id(patient.getId())
                .lastName(maskValue(shouldMask, patient.getLastName())).ssn(maskValue(shouldMask, patient.getSsn()))
                .dob(patient.getDob()).phoneNumber(patient.getPhoneNumber())
                .age(getAge(patient.getDob())).build();
    }

    private int getAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    private String maskValue(boolean shouldMask, String value) {
        if (shouldMask) {
            return value.replaceAll("[A-Za-z0-9]", "*");
        }
        return value;
    }
}
