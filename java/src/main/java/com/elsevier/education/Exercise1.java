package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final static class Person {	// NOTE: Declared as final so it can't be extended
		
		private final Set<String> phoneNumbers;		// NOTE: Declared all variables as final
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		// NOTE: Removing any method that can modify the class
		// public void setPhoneNumbers(Set<String> newPhoneNumbers) {
		// 	phoneNumbers = newPhoneNumbers;
		// }
		
		public String getFirstName() {
			return firstName;
		}

		// NOTE: Removing any method that can modify the class
		// public void setFirstName(String newName) {
		// 	firstName = newName;
		// }
		
		public String getLastName() {
			return lastName;
		}

		// NOTE: Removing any method that can modify the class
		// public void setLastName(String newName) {
		// 	lastName = newName;
		// }
	}
}