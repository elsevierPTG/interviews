package com.elsevier.javaspringapi.restcontroller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.request.SearchRequest;
import com.elsevier.javaspringapi.response.SearchResponse;
import com.elsevier.javaspringapi.service.PatientService;

@RestController
public class PatientRest {

	@Autowired
	private PatientService patientService;

	// GET /patients - return all patients
	@GetMapping("/patients")
	public ResponseEntity<List<Patient>> getAllPatients() {
		List<Patient> allPatient = patientService.getAllPatient();
		return new ResponseEntity<>(allPatient, HttpStatus.OK);
	}

	// GET /patients - return all patients with necessary fields de-identified
	// This can be the same endpoint as the other GET with a parameter, or it can be
	// a separate endpoint, your choice.

	@GetMapping("/patients")
	public ResponseEntity<List<Patient>> getAllPatientWithNcessaryFields(@RequestBody SearchRequest request) {
		List<SearchResponse> response = patientService.getAllPatientWithNcessaryFields(request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	// GET /patients/{id} - return specific patient

	@GetMapping("/patients/{id}")
	public ResponseEntity<Patient> getPatient(@PathVariable UUID id) {
		Patient patient = patientService.getPatientById(id);
		return new ResponseEntity<>(patient, HttpStatus.OK);
	}

	// POST /patients - save a given patient

	@PostMapping("/patients")
	public ResponseEntity<String> savePatient(@RequestBody Patient patient) {
		String responseMsg = "";

		boolean isSaved = patientService.savePatient(patient);

		if (isSaved) {
			responseMsg = "Patient Saved";
		} else {
			responseMsg = "Patient Not Saved";
		}
		return new ResponseEntity<>(responseMsg, HttpStatus.CREATED);
	}

	// PATCH /patients/{id} - save a given patient only passing in the necessary
	// fields

	@PatchMapping("/patients/{id}")
	public ResponseEntity<String> updatePatientWithNecessaryFields(@RequestBody Patient patient) {

		boolean isUpdated = patientService.updatePatient(patient);

		String msg = "";

		if (isUpdated) {
			msg = "Plan Updated";

		} else {
			msg = "Plan Updated";
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	// DELETE patients/{id} - delete a given patient if they exist

	@DeleteMapping("/patients/{id}")
	public ResponseEntity<String> deletePatient(@PathVariable UUID id) {
		boolean isDeleted = patientService.deletePatientById(id);

		String msg = "";
		if (isDeleted) {
			msg = "Patient Deleted";
		} else {
			msg = "Patient Not Deleted";
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
