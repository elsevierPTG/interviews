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

		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			// Perform defensive copy of phoneNumbers in case argument changed by client.
			// Wrap in unmodifiable view to prevent modification by consuming client.
			this.phoneNumbers = Collections.unmodifiableSet(new HashSet<>(phoneNumbers));
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