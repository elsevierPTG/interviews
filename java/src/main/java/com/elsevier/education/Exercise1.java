package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	final public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = new HashSet<>();

			// create defensive copy of phoneNumbers set
			// Check Exercise1Test
			for (String phoneNumber : phoneNumbers) {
				this.phoneNumbers.add(phoneNumber);
			}
		}

		// Check Exercise1Test
		public Set<String> getPhoneNumbers() {
			return Collections.unmodifiableSet(phoneNumbers); // or return the defensive copy of set.
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}