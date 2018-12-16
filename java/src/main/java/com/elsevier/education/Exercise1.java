package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

public class Exercise1 {

	/**
	 * Prevent the class from being extended
	 * @author frafi
	 *
	 */
	public final static class Person {
		/**
		 * All member fields should be marked final so they can only be
		 * modified inside a constructor.
		 */
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		/**
		 * Remove no-arguments constructor and instead provide a parameterized constructor
		 *
		 */
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}

		/**
		 * Provider getter only for phone numbers collection, no setter.
		 * Also provide a deep copy of the phone numbers.
		 * @return Collection of unique phone numbers
		 */
		public Set<String> getPhoneNumbers() {
			HashSet<String> retVal = new HashSet<String>(phoneNumbers.size());
			for(String phone : phoneNumbers) {
				retVal.add(new String(phone));
			}
			return retVal;
		}
		
		/**
		 * Provider getter only for first name, no setter
		 * @return First Name
		 */
		public String getFirstName() {
			return firstName;
		}
		
		/**
		 * Provider getter only for last name, no setter
		 * @return Last Name
		 */
		public String getLastName() {
			return lastName;
		}
	}
}