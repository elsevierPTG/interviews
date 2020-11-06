package com.elsevier.education;

import java.util.Collections;
import java.util.Set;

/**

TODO: Make this class immutable.

 removed the public setters to and made the properties final to ensure that they can't be changed
 wrapped the phonenumbers set in an unmodifiable set so that it can't have items added, changed, or removed
*/
public class Exercise1 {

	public static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = Collections.unmodifiableSet(phoneNumbers);
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