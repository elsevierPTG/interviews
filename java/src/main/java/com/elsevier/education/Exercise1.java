package com.elsevier.education;

import java.util.Collections;
import java.util.Set;

/**
 * Class was made immutable by:
 * 	declaring all class fields as final meaning that they cannot be changed once initialized
 *  removing setter operations from the public interface and passing in the field values during instantiation
 *  making the getter for the set of phone numbers return an unmodifiable collection
 * 
 * @author todd weber
 *
 */
public class Exercise1 {

	public static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		/**
		 * Construct a new person instance
		 * 
		 * @param phoneNumbers
		 *            - a set of strings
		 * @param firstName
		 *            - the first name
		 * @param lastName
		 *            - the last name
		 */
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/**
		 * 
		 * @return an unmodifiable set of phone numbers
		 */
		public Set<String> getPhoneNumbers() {
			return Collections.unmodifiableSet(phoneNumbers);
		}

		/**
		 * 
		 * @return the first name
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * 
		 * @return the last name
		 */
		public String getLastName() {
			return lastName;
		}
	}
}