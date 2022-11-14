package com.elsevier.javaspringapi.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.repository.PatientRepository;
import com.elsevier.javaspringapi.request.SearchRequest;
import com.elsevier.javaspringapi.response.SearchResponse;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}

	@Override
	public List<SearchResponse> getAllPatientWithNcessaryFields(SearchRequest request) {
		List<SearchResponse> response = new ArrayList<>();
		Patient queryBuilder = new Patient();

		String firstName = request.getFirstName();
		if (firstName != null && !firstName.equals("")) {
			queryBuilder.setFirstName(firstName);
			;
		}

		String lastName = request.getLastName();
		if (lastName != null && !lastName.equals("")) {
			queryBuilder.setFirstName(lastName);
		}

		LocalDate dateOfBirth = request.getDateOfBirth();
		if (dateOfBirth != null && !dateOfBirth.equals("")) {
			queryBuilder.setDateOfBirth(dateOfBirth);
			;
		}

		String ssn = request.getSsn();
		if (ssn != null && !ssn.equals("")) {
			queryBuilder.setSsn(ssn);
		}

		Example<Patient> example = Example.of(queryBuilder);

		List<Patient> entities = patientRepository.findAll();

		for (Patient entity : entities) {
			SearchResponse sr = new SearchResponse();
			BeanUtils.copyProperties(entity, sr);
			response.add(sr);
		}
		return response;

	}

	@Override
	public Patient getPatientById(UUID id) {
		Optional<Patient> findById = patientRepository.findById(id);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean savePatient(Patient patient) {
		Patient saved = patientRepository.save(patient);

		return saved.getId() != null;

	}

	@Override
	public boolean deletePatientById(UUID id) {
		boolean status = false;
		try {
			patientRepository.deleteById(id);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return status;
	}

	@Override
	public boolean updatePatient(Patient patient) {
		Patient save = patientRepository.save(patient);

		return patient.getId() != null;
	}

}
