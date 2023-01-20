package com.elsevier.javaspringapi.service;

import com.elsevier.javaspringapi.exception.PatientNotFoundException;
import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.repositories.PatientRepository;
import com.elsevier.javaspringapi.util.PatientUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PatientServiceTest {

    @MockBean
    private PatientRepository patientRepository;

    @Autowired
    PatientService patientService;

    private List<Patient> patientList;

    @BeforeEach
    void setUp() {
        patientList = new ArrayList<>() {{
            try {
                add(new Patient(UUID.fromString("4ced7ec1-0048-4907-a871-d93bfb933ece"), "Rakesh", "Singha", PatientUtils.generateDate("01-01-1900"), "SSN", "123-321-3456"));
                add(new Patient(UUID.fromString("2742971e-175f-41cd-a7d7-70d74eb70f30"), "Amit", "Kar", PatientUtils.generateDate("01-01-1980"), "SSN", "123-321-3456"));
                add(new Patient(UUID.fromString("fb61d092-953c-4c72-b382-205377d4c9ea"), "Pramod", "Das", PatientUtils.generateDate("01-01-2020"), "SSN", "123-321-3456"));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }};
    }
 //Junit to fetch patient by ID
    @Test
    public void fetchPatientById() throws PatientNotFoundException {
      String firstName = "Rakesh";
      String lastName = "Singha";
      when(patientRepository.getPatient(UUID.fromString("4ced7ec1-0048-4907-a871-d93bfb933ece"))).thenReturn(patientList.get(0));
        Patient patient =
                patientService.fetchPatientById(UUID.fromString("4ced7ec1-0048-4907-a871-d93bfb933ece"));

        assertEquals(firstName, patient.getFirstName());
        assertEquals(lastName, patient.getLastName());

    }
}
