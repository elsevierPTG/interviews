package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static class Person {
		
		private Set<String> phoneNumbers = new HashSet<>();
		private String firstName;
		private String lastName;
		
		public Person() {
		}

		/**
		 * This method will return a copy of the phone numbers set that is immutable.
		 * @return an immutable set containing the phone number
		 */
		public Set<String> getPhoneNumbers() {
			return Collections.unmodifiableSet(phoneNumbers);
		}

		/**
		 * The phone numbers will be added to the existing set. Preventing the calling class access to the stored set.
		 * @param newPhoneNumbers
		 */
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers.addAll(newPhoneNumbers);
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String newName) {
			firstName = newName;
		}
		
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String newName) {
			lastName = newName;
		}
	}
}