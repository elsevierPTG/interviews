package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/

/**
 * Make the class as final. And Remove all setter methods so that we can avoid
 * setting of values.
 **/
public final class Exercise1 {

	public static class Person {

		// Make all fields as final
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		/**
		 * Parameterized constructor is used for assigning values to variables.
		 * We are removing setter methods. and make the variables as private
		 * final with this we are restricting values assignment to variables
		 * explicitly. Now, we have only one way to assign values with this
		 * constructor when we are creating object. Once object is created we
		 * can't modify the values of class.
		 * 
		 * @param phoneNumbers
		 * @param firstName
		 * @param lastName
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