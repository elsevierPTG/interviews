package com.elsevier.education;

import java.util.Set;

/**
 TODO: Make this class immutable.
 */

/**
 *	An immutable class must be defined as 'final' which will make the class thread-safe
 *  All variables need to be defined as 'private' and 'final' so the state of the Person object cannot be changed
 *  Remove setter methods so fields so the state of the Person object cannot be changed

 *  @author Karen Rainsford
 *  @date	 17-Mar-2017
 */
public final class Exercise1 {

	public static class Person {

		/* Set is a ImmutableSet */
		private final Set<String> phoneNumbers =
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> pNumbers, String fName, String lName) {
			this.phoneNumbers = pNumbers;
			this.firstName = fName;
			this.lastName = lName
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