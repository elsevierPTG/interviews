package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	/**
	 * the class must be set to final so it can not be extended.
	 */
	public static final class Person {

		/**
		 * all members must be set to final.
		 */
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		/**
		 * constructor must take all args so that they can be set.
		 * @param phoneNumbers
		 * @param firstName
		 * @param lastName
		 */
		public Person(Set<String> phoneNumbers,String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/**
		 * all setters removed.
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