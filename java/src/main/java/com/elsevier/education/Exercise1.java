package com.elsevier.education;

import java.util.Set;
import java.util.HashSet;

/**
 * In order to make this class immutable, I made the following changes:
 * - made all fields final
 * - removed all setters
 * - made class final
 * - copied the set of phone numbers so that it is not a reference to a
 * mutable object
*/
public class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String newFirstName, String newLastName,
			Set<String> newPhoneNumbers) {
			firstName = newFirstName;
			lastName = newLastName;

			Set<String> phoneNumbersCopy = new HashSet<String>();
			phoneNumbersCopy.addAll(newPhoneNumbers);
			phoneNumbers = phoneNumbersCopy;
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
