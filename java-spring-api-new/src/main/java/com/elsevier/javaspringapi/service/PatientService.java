package com.elsevier.javaspringapi.service;

import java.util.List;
import java.util.UUID;

import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.request.SearchRequest;
import com.elsevier.javaspringapi.response.SearchResponse;

public interface PatientService {

	public List<Patient> getAllPatient();
	
	public List<SearchResponse> getAllPatientWithNcessaryFields(SearchRequest request);

	public Patient getPatientById(UUID id);

	public boolean savePatient(Patient patient);

	public boolean updatePatient(Patient patient);

	public boolean deletePatientById(UUID idd);

	

}
