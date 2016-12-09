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
		 * The only constructor to create Person with all values. No values can be changed after creation.
		 * Removed all setters
		 * @param firstName
		 * @param lastName
		 * @param phoneNumbers
		 */
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
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

		@Override
		public String toString() {
			final StringBuffer sb = new StringBuffer("Person{");
			sb.append("firstName='").append(firstName).append('\'');
			sb.append(", phoneNumbers=").append(phoneNumbers);
			sb.append(", lastName='").append(lastName).append('\'');
			sb.append('}');
			return sb.toString();
		}
	}
}