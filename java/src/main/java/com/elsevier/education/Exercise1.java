package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/

/**
 * 1. Making class final
 * 2. Making fields final
 * 3. Not providing setter methods for fields
 */
public final class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
//		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
//			phoneNumbers = newPhoneNumbers;
//		}
		
		public String getFirstName() {
			return firstName;
		}
//		public void setFirstName(String newName) {
//			firstName = newName;
//		}
		
		public String getLastName() {
			return lastName;
		}
//		public void setLastName(String newName) {
//			lastName = newName;
//		}
	}
}