package com.elsevier.javaspringapi.controller;

import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.service.PatientService;
import com.elsevier.javaspringapi.util.PatientUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PatientsController.class)
   class PatientControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private PatientService patientService;

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

    // JUnit test for Get All employees REST API
    @Test
    public void whenGetAllPatient_thenReturnPatientList() throws Exception{
        given(patientService.fetchPatientList()).willReturn(patientList);
        ResultActions response = mockMvc.perform(get("/patients"));

        response.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.size()",
                        is(patientList.size())));

    }

    // JUnit test for Get patients by ID REST API
    @Test
    public void GetPatientByIdTest() throws Exception{
        Mockito.when(patientService.fetchPatientById(UUID.fromString("4ced7ec1-0048-4907-a871-d93bfb933ece")))
                .thenReturn(patientList.get(0));

        mockMvc.perform(get("/patients/4ced7ec1-0048-4907-a871-d93bfb933ece")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(jsonPath("$.firstName").
                        value(patientList.get(0).getFirstName()));
    }

    @Test
    public void deletePatientByIdTest() throws Exception{
        UUID patientID = UUID.fromString("4ced7ec1-0048-4907-a871-d93bfb933ece");
        willDoNothing().given(patientService).deletePatientById(patientID);
        ResultActions response = mockMvc.perform(delete("/patients/{id}", patientID));
        response.andExpect(status().isOk())
                .andDo(print());
    }


}
