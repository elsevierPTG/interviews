package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
//Added final modify access, so any class cannot extends
//this class and modify data
public final class Exercise1 {
    //Added final modify access, so any class cannot extends
    //this class and modify data
    //Removed setXXX methods, so no one can update values.
	public static final class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		//Added new construction to set phoneNumbers, firstName, lastName
		public Person(final Set<String> phoneNumbers, final String firstName, final String lastName) {
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