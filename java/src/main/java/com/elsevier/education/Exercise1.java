package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * TODO: Make this class immutable.
 */
public class Exercise1 {

	public static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(String firstName, String lastName,
				final Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = new HashSet<String>();
			for (String pNo : phoneNumbers) {
				phoneNumbers.add(pNo);
			}
		}

		public Set<String> getPhoneNumbers() {
			return Collections.unmodifiableSet(phoneNumbers);
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}
	}
}