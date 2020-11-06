package com.elsevier.education;

import java.util.Set;

import static java.util.Collections.unmodifiableSet;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;


		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			// use unmodifiable set in order to avoid changing phoneNumber outside this class
			this.phoneNumbers = unmodifiableSet(phoneNumbers);
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