package com.elsevier.education;

import java.util.Set;

/**
* This class is immutable due to:
* 1. No "setter" methods to modify fields of object
* 2. All field final and private
* 3. Class is final, so does not allow to override methods
* @author Boris Filipov
*/
public class Exercise1 {

	public final static class Person {
		
		final private Set<String> phoneNumbers;
		final private String firstName;
		final private String lastName;
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
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