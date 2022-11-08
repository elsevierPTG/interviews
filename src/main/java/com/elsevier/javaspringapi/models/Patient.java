package com.elsevier.javaspringapi.models;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
//import org.springframework.data.annotation.Id;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

// TODO: implement this model

@Entity
@Data
@Table(name = "patient_table")

public class Patient {
	// public Patient() {}

	@Id
	@GeneratedValue(generator = "UUID")
	@Column(name = "UUID", updatable = false, nullable = false)
	@NotNull
	@NotEmpty
	private UUID id;

	@NotNull
	@NotEmpty
	@Column(name = "FIRST_NAME")
	private String firstName;

	@NotNull
	@NotEmpty
	@Column(name = "LAST_NAME")
	private String lastName;

	@NotNull
	@NotEmpty
	@Column(name = "DATA_OF_BIRTH")
	private LocalDate dateOfBirth;

	@NotNull
	@NotEmpty
	@Column(name = "SSN")
	private String ssn;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createDate;

	@Column(name = "UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;

}
