package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

Immutable objects' fields are intialized only once during instantiation, therefore we 
use constructor injection of field values and remove setters (mutation methods).

Chris Wolf <cw10025@gmail.com>, recruiter Emma Peterson <epeterse@teksystems.com>

*/
public class Exercise1 {

	public static class Person {
		
		final private Set<String> phoneNumbers;
		final private String firstName;
		final private String lastName;
		
		public Person(
		        final Set<String> phoneNumbers,
		        final String firstName,
		        final String lastName) {
		    
		    this.phoneNumbers = phoneNumbers;
		    this.firstName = firstName;
		    this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}
	}
}