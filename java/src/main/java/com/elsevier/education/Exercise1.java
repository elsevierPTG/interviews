package com.elsevier.education;

import java.util.Set;

/**
TODO: Make this class immutable.
*/
public class Exercise1 {

	public static class Person {
		
		// All variables are declared final to ensure they cannot be changed once instantiated
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		// Variables are assigned through constructor
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		// All set methods are removed to make the class immutable
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