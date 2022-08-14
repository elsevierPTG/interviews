package com.elsevier.javaspringapi.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.elsevier.javaspringapi.contract.PatientDto;
import com.elsevier.javaspringapi.contract.PatientPatchDto;
import com.elsevier.javaspringapi.service.PatientService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
class PatientControllerTest {

    private static final UUID ID = UUID.fromString("d8fe513d-779b-40cd-873f-8165cf63e699");

    @InjectMocks
    private PatientController underTest;

    @Mock
    private PatientService patientService;

    @Test
    void getPatients() {

        List<PatientDto> patientDtos = new ArrayList<>();
        when(patientService.getAllPatients(false)).thenReturn(patientDtos);

        List<PatientDto> result = underTest.getPatients(false);

        assertSame(patientDtos, result);
    }

    @Test
    void getPatient() {

        PatientDto patientDto = new PatientDto();
        when(patientService.getPatient(ID, false)).thenReturn(patientDto);

        PatientDto result = underTest.getPatient(ID, false);

        assertSame(patientDto, result);
    }

    @Test
    void createPatient() {

        PatientDto patientDto = new PatientDto();
        when(patientService.createPatient(patientDto)).thenReturn(ID);

        ResponseEntity<Void> result = underTest.createPatient(patientDto);

        assertEquals(HttpStatus.CREATED, result.getStatusCode());
        assertNotNull(result.getHeaders().getLocation());
        assertEquals("/patients/d8fe513d-779b-40cd-873f-8165cf63e699", result.getHeaders().getLocation().toString());
    }

    @Test
    void updatePatient() {

        PatientPatchDto patientPatchDto = new PatientPatchDto();

        ResponseEntity<Void> result = underTest.updatePatient(ID, patientPatchDto);

        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());
        verify(patientService).updatePatient(ID, patientPatchDto);
    }

    @Test
    void deletePatient() {

        ResponseEntity<Void> result = underTest.deletePatient(ID);

        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());
        verify(patientService).deletePatient(ID);
    }
}