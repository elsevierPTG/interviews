package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		// parameterised constructor is done to assign the value to all the final class variable during object initialisation
		public Person(Set<String> newPhoneNumbers,String newFirstName, String newLastName) {
			this.phoneNumbers = newPhoneNumbers;
			this.lastName =  newLastName;
			this.firstName = newFirstName;
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
