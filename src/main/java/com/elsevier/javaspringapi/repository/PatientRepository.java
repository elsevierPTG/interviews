package com.elsevier.javaspringapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elsevier.javaspringapi.models.Patient;

public interface PatientRepository extends JpaRepository<Patient, UUID>{

}
