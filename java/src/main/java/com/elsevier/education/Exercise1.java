package com.elsevier.education;

import java.util.Set;
import java.util.HashSet;

/**

TODO: Make this class immutable.

*/
final public class Exercise1 {

	public static class Person {
		
		final private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			return new HashSet<String>(phoneNumbers);
		}

		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}

	}
}