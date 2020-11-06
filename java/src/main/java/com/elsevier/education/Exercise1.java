package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		/**
		 * Contstructor
		 *
		 * For an immutable class every field MUST be passed in
		 * since there is no changing it afterwards
		 * 
		 * @param firstName
		 * @param lastName
		 * @param phoneNumbers
		 * @return
		 */
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}

		/*
		No need for setters, no longer allowed, removed
		 */
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