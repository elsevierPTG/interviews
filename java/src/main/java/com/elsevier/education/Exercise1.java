package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

Lavkesh:
 I initilaize all fields through constructor
 I deleted all setter method as there will be no setter method in immutable class
 I return copy of phoneNumbers set as set is mutable object. We need to return copy of mutable object.
 I make class as final, as no class can extend it and modify its behaviour.
*/
public class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}
		
		public Set<String> getPhoneNumbers() {
			return phoneNumbers != null ? new HashSet<>(phoneNumbers) : null;
		}
		
		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

	}
}