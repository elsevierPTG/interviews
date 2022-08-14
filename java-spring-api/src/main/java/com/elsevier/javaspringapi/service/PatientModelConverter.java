package com.elsevier.javaspringapi.service;

import com.elsevier.javaspringapi.contract.PatientDto;
import com.elsevier.javaspringapi.models.Patient;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class PatientModelConverter {

    private static final String MASK_CHAR = "*";

    public PatientDto convertModelToDto(Patient patient, boolean deIdentify) {

        PatientDto patientDto = new PatientDto();
        patientDto.setId(patient.getId());
        patientDto.setFirstName(patient.getFirstName());
        patientDto.setPhoneNumber(patient.getPhoneNumber());
        LocalDate dob = patient.getDob().toLocalDate();
        patientDto.setDob(dob);
        patientDto.setAge(getAge(dob));

        if (deIdentify) {
            patientDto.setLastName(MASK_CHAR);
            patientDto.setSsn(MASK_CHAR);
        } else {
            patientDto.setLastName(patient.getLastName());
            patientDto.setSsn(patient.getSsn());
        }
        return patientDto;
    }

    public Patient convertDtoToModel(PatientDto patientDto) {

        Patient patient = new Patient();

        patient.setId(generatePatientId());
        patient.setFirstName(patientDto.getFirstName());
        patient.setPhoneNumber(patientDto.getPhoneNumber());
        patient.setDob(Date.valueOf(patientDto.getDob()));
        patient.setLastName(patientDto.getLastName());
        patient.setSsn(patientDto.getSsn());

        return patient;
    }

    private UUID generatePatientId() {
        return UUID.randomUUID();
    }

    private int getAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
