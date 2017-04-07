package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/

// Removed setters, values (phoneNumbers, firstName and lastName) can only be set upon instantiation. Getters
// can be called to retrieve values.

public class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
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
