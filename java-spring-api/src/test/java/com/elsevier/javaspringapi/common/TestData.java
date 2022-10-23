package com.elsevier.javaspringapi.common;

import com.elsevier.javaspringapi.dto.PatientDto;
import com.elsevier.javaspringapi.dto.PatientPatchDto;
import com.elsevier.javaspringapi.models.Patient;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static java.time.Month.AUGUST;
import static java.util.Collections.singletonList;
import static java.util.UUID.randomUUID;

public interface TestData {

    UUID ID = randomUUID();

    PatientPatchDto PATIENT_PATCH_DTO = PatientPatchDto.builder().lastName("PatchDoe").phoneNumber("314-424-4222").build();

    Patient PATIENT = Patient.builder().id(ID).lastName("Doe").firstName("Jane").dob(LocalDate.of(1991, AUGUST, 31))
            .ssn("111-11-1111").phoneNumber("123-456-7890").build();

    PatientDto PATIENT_DTO = PatientDto.builder().id(ID).lastName("Doe").firstName("Jane").dob(LocalDate.of(1991, AUGUST, 31))
            .ssn("111-11-1111").phoneNumber("123-456-7890").age(30).build();

    default List<Patient> getPatientData() {
        return singletonList(PATIENT);
    }

    default List<PatientDto> getPatientDTOData() {
        return singletonList(PATIENT_DTO);
    }

}
