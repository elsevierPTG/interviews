package com.elsevier.javaspringapi.controller;

import com.elsevier.javaspringapi.exception.PatientNotFoundException;
import com.elsevier.javaspringapi.models.Patient;
import com.elsevier.javaspringapi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/patients")
public class PatientsController {

    @Autowired
    private PatientService patientService;


    @GetMapping()
    public ResponseEntity<List<Patient>> fetchPatient() {
        List<Patient> patientList = patientService.fetchPatientList();
        if (!CollectionUtils.isEmpty(patientList)) {
            return new ResponseEntity<>(patientService.fetchPatientList(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> fetchPatientByID(@PathVariable("id") UUID id) throws PatientNotFoundException {
        return new ResponseEntity<>(patientService.fetchPatientById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> savePatient(@Valid @RequestBody Patient patient) {
        patientService.savePatient(patient);
        return new ResponseEntity<>("Patient saved Successfully!!", HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<String> updatePatients(@Valid @RequestBody Patient patient, @PathVariable("id") UUID id) throws PatientNotFoundException {
        patientService.updatePatients(patient, id);
        return new ResponseEntity<>("Patient Updated Successfully!!", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePatientById(@PathVariable("id") UUID id) throws PatientNotFoundException {
        patientService.deletePatientById(id);
        return new ResponseEntity<>("Patient deleted Successfully!!", HttpStatus.OK);
    }

}