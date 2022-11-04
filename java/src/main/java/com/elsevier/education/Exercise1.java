package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 {

	public static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(Set<String> newPhoneNumbers, String newFirstName, String newLastName) {
			this.phoneNumbers = newPhoneNumbers;
            this.firstName = newFirstName;
			this.lastName = newLastName;
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
