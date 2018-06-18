package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

Class marked as final.

*/
public final class Exercise1 {

	public static class Person {
		
		/**
		 * All fields need to be final and private to avoid any change
		 */
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		/**
		 * 
		 * Phone numbers from parameters are copied to the local list to avoid any possible alteration from the source.
		 * 
		 * @param phoneNumbers
		 * @param firstName
		 * @param lastName
		 */
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = new HashSet<>(phoneNumbers);
			this.firstName = firstName;
			this.lastName = lastName;
			
		}

		public Set<String> getPhoneNumbers() {
			/**
			 * To avoid any alteration after returning the list, a copy of the set is returned.
			 */
			return new HashSet<>(phoneNumbers);
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		/**
		 * Setters are removed to deny replacements.
		 */
	}
}