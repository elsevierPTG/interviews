package com.elsevier.javaspringapi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.elsevier.javaspringapi.contract.PatientDto;
import com.elsevier.javaspringapi.contract.PatientPatchDto;
import com.elsevier.javaspringapi.exception.CustomException;
import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.repositories.PatientRepository;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

@ExtendWith(MockitoExtension.class)
class PatientServiceTest {

    private static final UUID ID = UUID.fromString("d8fe513d-779b-40cd-873f-8165cf63e699");

    @InjectMocks
    private PatientService underTest;

    @Mock
    private PatientRepository patientRepository;

    @Mock
    private PatientModelConverter patientModelConverter;

    @Test
    void getAllPatients() {

        Patient patient = buildPatient(ID.toString(), "Dave", "Bever", "123-45-6789", LocalDate.of(1990, 10, 9),
                "212-212-2202");

        when(patientRepository.getPatients()).thenReturn(List.of(patient));
        PatientDto patientDto = new PatientDto();
        when(patientModelConverter.convertModelToDto(patient, false)).thenReturn(patientDto);

        List<PatientDto> result = underTest.getAllPatients(false);

        assertEquals(1, result.size());
        assertSame(patientDto, result.get(0));
    }

    @Test
    void getAllPatients_emptyResult() {

        when(patientRepository.getPatients()).thenReturn(List.of());

        List<PatientDto> result = underTest.getAllPatients(false);

        assertTrue(result.isEmpty());
    }

    @Test
    void getPatient() {

        Patient patient = buildPatient(ID.toString(), "Dave", "Bever", "123-45-6789", LocalDate.of(1990, 10, 9),
                "212-212-2202");

        when(patientRepository.getPatient(ID)).thenReturn(Optional.of(patient));

        PatientDto patientDto = new PatientDto();
        when(patientModelConverter.convertModelToDto(patient, false)).thenReturn(patientDto);

        PatientDto result = underTest.getPatient(ID, false);

        assertSame(patientDto, result);
    }

    @Test
    void getPatient_notFound() {

        when(patientRepository.getPatient(ID)).thenReturn(Optional.empty());

        CustomException exception = assertThrows(CustomException.class, () -> underTest.getPatient(ID, false));

        assertEquals(HttpStatus.NOT_FOUND, exception.getCode());
        assertEquals("Patient info not found", exception.getMessage());
    }

    @Test
    void createPatient() {

        PatientDto patientDto = new PatientDto();
        Patient patient = buildPatient(ID.toString(), "Dave", "Bever", "123-45-6789", LocalDate.of(1990, 10, 9),
                "212-212-2202");

        when(patientRepository.getPatients()).thenReturn(List.of());
        when(patientModelConverter.convertDtoToModel(patientDto)).thenReturn(patient);
        UUID result = underTest.createPatient(patientDto);

        verify(patientRepository).save(patient);

        assertEquals(ID, result);
    }

    @Test
    void createPatient_alreadyExists() {

        PatientDto patientDto = new PatientDto();
        patientDto.setSsn("123-45-6789");
        Patient patient = buildPatient(ID.toString(), "Dave", "Bever", "123-45-6789", LocalDate.of(1990, 10, 9),
                "212-212-2202");

        when(patientRepository.getPatients()).thenReturn(List.of(patient));

        CustomException exception = assertThrows(CustomException.class, () -> underTest.createPatient(patientDto));

        assertEquals(HttpStatus.BAD_REQUEST, exception.getCode());
        assertEquals("Patient already exists", exception.getMessage());
    }

    @Test
    void updatePatient() {

        Patient patient = buildPatient(ID.toString(), "Dave", "Bever", "123-45-6789", LocalDate.of(1990, 10, 9),
                "212-212-2202");
        when(patientRepository.getPatient(ID)).thenReturn(Optional.of(patient));

        PatientPatchDto patientPatchDto = new PatientPatchDto();
        patientPatchDto.setLastName("lastName");
        patientPatchDto.setPhoneNumber("123-456-6789");

        underTest.updatePatient(ID, patientPatchDto);

        assertEquals("123-456-6789", patient.getPhoneNumber());
        assertEquals("lastName", patient.getLastName());
    }

    @Test
    void updatePatient_lastName() {

        Patient patient = buildPatient(ID.toString(), "Dave", "Bever", "123-45-6789", LocalDate.of(1990, 10, 9),
                "212-212-2202");
        when(patientRepository.getPatient(ID)).thenReturn(Optional.of(patient));

        PatientPatchDto patientPatchDto = new PatientPatchDto();
        patientPatchDto.setLastName("lastName");

        underTest.updatePatient(ID, patientPatchDto);

        assertEquals("lastName", patient.getLastName());
        // removed Phone number
        assertNull(patient.getPhoneNumber());
    }

    @Test
    void updatePatient_phoneNumber() {

        Patient patient = buildPatient(ID.toString(), "Dave", "Bever", "123-45-6789", LocalDate.of(1990, 10, 9),
                "212-212-2202");
        when(patientRepository.getPatient(ID)).thenReturn(Optional.of(patient));

        PatientPatchDto patientPatchDto = new PatientPatchDto();
        patientPatchDto.setPhoneNumber("123-456-6789");

        underTest.updatePatient(ID, patientPatchDto);

        assertEquals("123-456-6789", patient.getPhoneNumber());
        // preserve existing lastName
        assertEquals("Bever", patient.getLastName());
    }

    @Test
    void updatePatient_noInput() {

        Patient patient = buildPatient(ID.toString(), "Dave", "Bever", "123-45-6789", LocalDate.of(1990, 10, 9),
                "212-212-2202");
        when(patientRepository.getPatient(ID)).thenReturn(Optional.of(patient));

        PatientPatchDto patientPatchDto = new PatientPatchDto();

        underTest.updatePatient(ID, patientPatchDto);

        // removed phone number
        assertNull(patient.getPhoneNumber());
        // preserve existing lastName
        assertEquals("Bever", patient.getLastName());
    }

    @Test
    void deletePatient() {

        underTest.deletePatient(ID);

        verify(patientRepository).delete(ID);
    }

    private Patient buildPatient(String id, String firstName, String lastName, String ssn, LocalDate dob, String phoneNumber) {

        Patient patient = new Patient();
        patient.setId(UUID.fromString(id));
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setDob(Date.valueOf(dob));
        patient.setSsn(ssn);
        patient.setPhoneNumber(phoneNumber);
        return patient;
    }
}