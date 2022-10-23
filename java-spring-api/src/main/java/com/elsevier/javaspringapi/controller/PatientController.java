package com.elsevier.javaspringapi.controller;

import com.elsevier.javaspringapi.dto.PatientDto;
import com.elsevier.javaspringapi.dto.PatientPatchDto;
import com.elsevier.javaspringapi.service.PatientService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static java.util.Collections.singletonMap;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.MediaType.*;

@Validated
@RestController
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public List<PatientDto> getPatients(@RequestParam(name = "deIdentify", required = false) boolean shouldMask) {
        return patientService.getAllPatients(shouldMask);
    }

    @GetMapping("/patients/{id}")
    public PatientDto getPatient(@PathVariable(name = "id") UUID id,
            @RequestParam(name = "deIdentify", required = false) boolean deIdentify) {
        return patientService.getPatient(id, deIdentify);
    }

    @PostMapping(value = "/patients", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> createPatient(@Valid @RequestBody PatientDto patientDto) {
        UUID patientId = patientService.createPatient(patientDto);
        return new ResponseEntity<>(singletonMap(
                "message", "Patient Created: " + URI.create("/patients/" + patientId.toString())), CREATED);
    }

    @PatchMapping(value = "/patients/{id}", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> updatePatient(@PathVariable(name = "id") UUID id,
                                                             @Valid @RequestBody PatientPatchDto patientPatchDto) {
        patientService.updatePatient(id, patientPatchDto);
        return new ResponseEntity<>(singletonMap("message", "Patient updated successfully"), NO_CONTENT);
    }

    @DeleteMapping("/patients/{id}")
    public ResponseEntity<Map<String, String>> deletePatient(@PathVariable(name = "id") UUID id) {
        patientService.deletePatient(id);
        return new ResponseEntity<>(singletonMap("message", "Patient deleted successfully"), NO_CONTENT);
    }
}
