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
		 * In order to make this immutable, all values must be
                 * passed through the constructor only with no other means
                 * of manipulation once created.
                 *
                 * @param phoneNumbers   a set of numbers associated with a given person
                 * @param firstName      A person's first name
                 * @param lastName       A person's last name
                 * @return               An instance of a person with all attributes read only
                 */
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
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
