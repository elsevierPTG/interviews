package com.elsevier.javaspringapi.controller;

import com.elsevier.javaspringapi.contract.PatientDto;
import com.elsevier.javaspringapi.contract.PatientPatchDto;
import com.elsevier.javaspringapi.service.PatientService;
import java.net.URI;
import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public List<PatientDto> getPatients(@RequestParam(name = "deIdentify", required = false) boolean deIdentify) {
        return patientService.getAllPatients(deIdentify);
    }

    @GetMapping("/patients/{id}")
    public PatientDto getPatient(@PathVariable(name = "id") UUID id,
            @RequestParam(name = "deIdentify", required = false) boolean deIdentify) {
        return patientService.getPatient(id, deIdentify);
    }

    @PostMapping(value = "/patients", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createPatient(@Valid @RequestBody PatientDto patientDto) {
        UUID patientId = patientService.createPatient(patientDto);
        return ResponseEntity.created(URI.create("/patients/" + patientId.toString())).build();
    }

    @PatchMapping(value = "/patients/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updatePatient(@PathVariable(name = "id") UUID id,
            @Valid @RequestBody PatientPatchDto patientPatchDto) {
        patientService.updatePatient(id, patientPatchDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/patients/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable(name = "id") UUID id) {
        patientService.deletePatient(id);
        return ResponseEntity.noContent().build();
    }
}
