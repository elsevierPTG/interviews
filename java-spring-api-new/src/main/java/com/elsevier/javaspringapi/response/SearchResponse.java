package com.elsevier.javaspringapi.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchResponse {
	
	private String firstName;;
	private String lastName;
	private LocalDate dateOfBirth;
	private String ssn;

}
