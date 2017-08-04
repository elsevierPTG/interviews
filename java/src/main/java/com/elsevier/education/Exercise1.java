package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/

/**
 * Marked as Final to make this class immutable and innter class also made immutable
 * Removed all Settter methods to make this class does not accept any values
 */
public final class Exercise1 {

	public final static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person() {
		}

		//public Set<String> getPhoneNumbers() {
		//	return phoneNumbers;
		//}
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}
		//public void setFirstName(String newName) {
		//	firstName = newName;
		//}
		
		public String getLastName() {
			return lastName;
		}
		//public void setLastName(String newName) {
		//	lastName = newName;
		//}
	}
}