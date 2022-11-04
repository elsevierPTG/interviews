package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;

		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/**
		 * Create a new collection to make the collection immutable.
		 * It will not make the elements of the collection immutable though.
		 * @return
		 */
		public Set<String> getPhoneNumbers() {
			if (phoneNumbers != null) {
				return new HashSet<String>(phoneNumbers);
			} else {
				return phoneNumbers;
			}
		}

		/**
		 * Java Strings are immutable, no need to clone
		 * @return
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * Java Strings are immutable
		 * @return
		 */
		public String getLastName() {
			return lastName;
		}
	}
}