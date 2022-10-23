package com.elsevier.javaspringapi.controller;

import com.elsevier.javaspringapi.common.TestData;
import com.elsevier.javaspringapi.dto.PatientDto;
import com.elsevier.javaspringapi.service.PatientService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static java.util.Collections.singletonMap;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@ExtendWith(MockitoExtension.class)
class PatientControllerTest implements TestData {

    private static final UUID ID = UUID.randomUUID();

    @InjectMocks
    private PatientController patientController;

    @Mock
    private PatientService patientService;

    @Test
    void testGetPatients() {
        List<PatientDto> patientDtos = getPatientDTOData();
        when(patientService.getAllPatients(false)).thenReturn(patientDtos);
        List<PatientDto> result = patientController.getPatients(false);
        assertSame(patientDtos, result);
    }

    @Test
    void testGetPatientsWithMask() {
        List<PatientDto> patientDtos = getPatientDTOData();
        when(patientService.getAllPatients(true)).thenReturn(patientDtos);
        List<PatientDto> result = patientController.getPatients(true);
        assertSame(patientDtos, result);
    }

    @Test
    void testGetPatient() {
        when(patientService.getPatient(ID,false)).thenReturn(PATIENT_DTO);
        PatientDto result = patientController.getPatient(ID,false);
        assertSame(PATIENT_DTO, result);
    }

    @Test
    void testGetPatientWithMask() {
        when(patientService.getPatient(ID, true)).thenReturn(PATIENT_DTO);
        PatientDto result = patientController.getPatient(ID, true);
        assertSame(PATIENT_DTO, result);
    }

    @Test
    void testCreatePatient() {
        when(patientService.createPatient(PATIENT_DTO)).thenReturn(ID);
        ResponseEntity<Map<String, String>> result = patientController.createPatient(PATIENT_DTO);
        assertSame(result.getStatusCode(), CREATED);
        assertEquals(result.getBody(), singletonMap("message", "Patient Created: " + URI.create("/patients/" + ID)));
    }

    @Test
    void testCreatePatient_throwsServiceException() {
        when(patientService.createPatient(PATIENT_DTO)).thenThrow(new RuntimeException("Failed to create"));
        assertThrows(RuntimeException.class, () -> patientController.createPatient(PATIENT_DTO));
    }

    @Test
    void testUpdatePatient() {
        ResponseEntity<Map<String, String>> result = patientController.updatePatient(ID, PATIENT_PATCH_DTO);
        assertSame(result.getStatusCode(), NO_CONTENT);
        assertEquals(result.getBody(), singletonMap("message", "Patient updated successfully"));
    }

    @Test
    void testUpdatePatient_throwsServiceException() {
        doThrow(new RuntimeException("Failed to create")).when(patientService).updatePatient(ID, PATIENT_PATCH_DTO);
        assertThrows(RuntimeException.class, () -> patientController.updatePatient(ID, PATIENT_PATCH_DTO));
    }

    @Test
    void testDeletePatient() {
        ResponseEntity<Map<String, String>> result = patientController.deletePatient(ID);
        assertSame(result.getStatusCode(), NO_CONTENT);
        assertEquals(result.getBody(), singletonMap("message", "Patient deleted successfully"));
    }

    @Test
    void testDeletePatient_throwsServiceException() {
        doThrow(new RuntimeException("Failed to delete")).when(patientService).deletePatient(ID);
        assertThrows(RuntimeException.class, () -> patientController.deletePatient(ID));
    }
}