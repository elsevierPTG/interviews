package com.elsevier.javaspringapi.service;

import com.elsevier.javaspringapi.common.TestData;
import com.elsevier.javaspringapi.dto.PatientDto;
import com.elsevier.javaspringapi.dto.mapper.DTOMapper;
import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.models.mapper.ModelMapper;
import com.elsevier.javaspringapi.repositories.PatientRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PatientServiceTest implements TestData {

    @InjectMocks
    private PatientService patientService;

    @Mock
    private PatientRepository patientRepository;

    @Mock
    private DTOMapper dtoMapper;

    @Mock
    private ModelMapper modelMapper;

    @Test
    void testGetAllPatients() {
        List<Patient> patientsData = getPatientData();
        when(patientRepository.getPatients()).thenReturn(patientsData);
        when(dtoMapper.map(PATIENT, false)).thenReturn(PATIENT_DTO);
        List<PatientDto> result = patientService.getAllPatients(false);
        assertEquals(1, result.size());
    }

    @Test
    void testGetAllPatientsWithMask() {
        List<Patient> patientsData = getPatientData();
        when(patientRepository.getPatients()).thenReturn(patientsData);
        when(dtoMapper.map(PATIENT, true)).thenReturn(PATIENT_DTO);
        List<PatientDto> result = patientService.getAllPatients(true);
        assertEquals(1, result.size());
    }

    @Test
    void testGetAllPatients_whenRepoThrowsException() {
        when(patientRepository.getPatients()).thenThrow(new RuntimeException("Data access Exception"));
        assertThrows(RuntimeException.class, () -> patientService.getAllPatients(false));
    }

    @Test
    void testGetAllPatients_whenMapperThrowsException() {
        List<Patient> patientsData = getPatientData();
        when(patientRepository.getPatients()).thenReturn(patientsData);
        when(dtoMapper.map(PATIENT, false)).thenThrow(new RuntimeException("NullPointer Exception"));
        assertThrows(RuntimeException.class, () -> patientService.getAllPatients(false));
    }

    @Test
    void testGetPatient() {
        when(patientRepository.getPatient(PATIENT.getId())).thenReturn(PATIENT);
        when(dtoMapper.map(PATIENT, false)).thenReturn(PATIENT_DTO);
        PatientDto result = patientService.getPatient(PATIENT.getId(), false);
        assertEquals(PATIENT_DTO.getId(), result.getId());
    }

    @Test
    void testGetPatientWithMask() {
        when(patientRepository.getPatient(PATIENT.getId())).thenReturn(PATIENT);
        when(dtoMapper.map(PATIENT, true)).thenReturn(PATIENT_DTO);
        PatientDto result = patientService.getPatient(PATIENT.getId(), true);
        assertEquals(PATIENT_DTO.getId(), result.getId());
    }

    @Test
    void testCreatePatient() {
        when(modelMapper.map(PATIENT_DTO)).thenReturn(PATIENT);
        UUID result = patientService.createPatient(PATIENT_DTO);
        assertEquals(result, ID);
    }

    @Test
    void testCreatePatient_whenRepoThrowsException() {
        doThrow(new RuntimeException("Unable to create")).when(patientRepository).save(isA(Patient.class));
        assertThrows(RuntimeException.class, () -> patientService.createPatient(PATIENT_DTO));
    }

    @Test
    void testDeletePatient() {
        patientService.deletePatient(ID);
    }

    @Test
    void testDeletePatient_whenRepoThrowsException() {
        doThrow(new RuntimeException("Unable to delete")).when(patientRepository).delete(eq(ID));
        assertThrows(RuntimeException.class, () -> patientService.deletePatient(ID));
    }

    @Test
    void testUpdatePatient() {
        when(patientRepository.getPatient(PATIENT.getId())).thenReturn(PATIENT);
        patientService.updatePatient(ID, PATIENT_PATCH_DTO);
        assertEquals("PatchDoe", PATIENT.getLastName());
        assertEquals("314-424-4222", PATIENT.getPhoneNumber());
    }

    @Test
    void testUpdatePatient_WhenRepositoryThrowsException() {
        when(patientRepository.getPatient(PATIENT.getId())).thenThrow(new RuntimeException("Not found"));
        assertThrows(RuntimeException.class, () -> patientService.updatePatient(ID, PATIENT_PATCH_DTO));
    }
}