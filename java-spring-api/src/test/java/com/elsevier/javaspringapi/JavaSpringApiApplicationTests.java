package com.elsevier.javaspringapi;

import com.elsevier.javaspringapi.common.TestData;
import com.elsevier.javaspringapi.controller.PatientController;
import com.elsevier.javaspringapi.dto.PatientDto;
import com.elsevier.javaspringapi.exception.NotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import static java.util.UUID.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class JavaSpringApiApplicationTests implements TestData {

	@Autowired
	public PatientController patientController;

	@Test
	void testGetAllPatients() {
		List<PatientDto> patientDtos = patientController.getPatients(false);
		assertEquals( 2, patientDtos.size());
		assertEquals(patientDtos.get(0).getLastName(), "Doe");
		assertEquals(patientDtos.get(0).getSsn(), "111-11-1111");
		assertEquals(patientDtos.get(1).getLastName(), "Doe");
		assertEquals(patientDtos.get(1).getSsn(), "222-22-2222");
	}

	@Test
	void testGetAllPatientsMasked() {
		List<PatientDto> patientDtos = patientController.getPatients(true);
		assertEquals( 2, patientDtos.size());
		assertEquals(patientDtos.get(0).getLastName(), "***");
		assertEquals(patientDtos.get(0).getSsn(), "***-**-****");
		assertEquals(patientDtos.get(1).getLastName(), "***");
		assertEquals(patientDtos.get(1).getSsn(), "***-**-****");
	}

	@Test
	void testGetPatient() {
		PatientDto patientDto = patientController.getPatient(fromString("ac78b16f-59fa-4e75-9c92-c5c4a2daae8c"), false);
		assertEquals(patientDto.getLastName(), "Doe");
		assertEquals(patientDto.getSsn(), "111-11-1111");
	}

	@Test
	void testCreateAndDeletePatient() {
		ResponseEntity<Map<String, String>> response = patientController.createPatient(PATIENT_DTO);
		String id = response.getBody().get("message").split("/patients/")[1];
		assertEquals( response.getStatusCode(), CREATED);

		response = patientController.deletePatient(fromString(id));
		assertEquals( response.getStatusCode(), NO_CONTENT);

		assertThrows(NotFoundException.class, () -> patientController.getPatient(fromString(id), false));

	}

	@Test
	void testUpdatePatient() {
		UUID id = fromString("ac78b16f-59fa-4e75-9c92-c5c4a2daae8c");
		ResponseEntity<Map<String, String>> response = patientController.updatePatient(id, PATIENT_PATCH_DTO);
		assertEquals(response.getStatusCode(), NO_CONTENT);

		PatientDto patientDto = patientController.getPatient(id, false);
		assertEquals(patientDto.getLastName(), PATIENT_PATCH_DTO.getLastName());
		assertEquals(patientDto.getPhoneNumber(), PATIENT_PATCH_DTO.getPhoneNumber());
	}

	@Test
	void testUpdatePatient_ThrowsException() {
		assertThrows(NotFoundException.class, () -> patientController.updatePatient(ID, PATIENT_PATCH_DTO));
	}
}
