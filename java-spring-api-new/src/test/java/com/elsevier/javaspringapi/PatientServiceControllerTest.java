package com.elsevier.javaspringapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.elsevier.javaspringapi.models.Patient;

public class PatientServiceControllerTest extends JavaSpringApiApplicationTests {

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void getProductsList() throws Exception {
		String uri = "/patients";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		Patient[] patientlist = super.mapFromJson(content, Patient[].class);
		assertTrue(patientlist.length > 0);
	}

	@Test
	public void createProduct() throws Exception {
		String uri = "/patients";
		Patient patient = new Patient();
		patient.setFirstName("Mark");
		patient.setLastName("John");
		patient.setDateOfBirth("2021-09-08");
		patient.setSsn("dfhyhn466");
		String inputJson = super.mapToJson(patient);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, "Patient is created successfully");
	}

	@Test
	public void updatePatient() throws Exception {
		String uri = "/patients/2";
		Patient patient = new Patient();
		patient.setFirstName("Mark");
		patient.setLastName("John");
		patient.setDateOfBirth("2021-09-08");
		patient.setSsn("dfhyhn466");
		String inputJson = super.mapToJson(patient);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.put(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, "Patient is updated successsfully");
	}

	@Test
	public void deletePatient() throws Exception {
		String uri = "/patients/2";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, "Patient is deleted successsfully");
	}
}
