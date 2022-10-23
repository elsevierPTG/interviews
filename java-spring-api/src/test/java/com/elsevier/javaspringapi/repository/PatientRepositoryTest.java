package com.elsevier.javaspringapi.repository;

import com.elsevier.javaspringapi.common.TestData;
import com.elsevier.javaspringapi.exception.NotFoundException;
import com.elsevier.javaspringapi.exception.ObjectAlreadyExist;
import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.repositories.PatientRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.UUID;

import static java.time.Month.AUGUST;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PatientRepositoryTest implements TestData {

    @InjectMocks
    private PatientRepository patientRepository;

    @Test
    public void getPatients_withDefaultRecords() {
        assertEquals(2, patientRepository.getPatients().size());
    }

    @Test
    public void testGetPatient() {
        assertNotNull(patientRepository.getPatient(UUID.fromString("ebad6e7a-48aa-416f-b3d2-6c15403a4e1d")));
    }

    @Test
    public void testGetPatient_ThrowsNotFoundException() {
        assertThrows(NotFoundException.class, () -> patientRepository.getPatient(UUID.fromString("ebad6e7a-49aa-416f-b3d2-6c15403a4e1d")));
    }

    @Test
    public void testSaveAndDeletePatient() {
        patientRepository.save(PATIENT);
        assertEquals(3, patientRepository.getPatients().size());
        patientRepository.delete(PATIENT.getId());
        assertEquals(2, patientRepository.getPatients().size());
    }

    @Test
    public void testSavePatient_throwsConflict() {
        Patient patient =Patient.builder().id(UUID.fromString("ac78b16f-59fa-4e75-9c92-c5c4a2daae8c")).lastName("Doe")
                .firstName("Jane").dob(LocalDate.of(1991, AUGUST, 31))
                .ssn("111-11-1111").phoneNumber("123-456-7890").build();
        assertThrows(ObjectAlreadyExist.class, () -> patientRepository.save(patient));
    }

    @Test
    public void testDeletePatient_throwsNotFoundException() {
        assertThrows(NotFoundException.class, () -> patientRepository.delete(ID));
    }
}
