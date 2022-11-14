package com.elsevier.javaspringapi.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {
	
	private String firstName;;
	private String lastName;
	private LocalDate dateOfBirth;
	private String ssn;

}
