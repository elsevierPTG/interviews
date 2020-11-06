package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final static class Person {

		public final Set<String> phoneNumbers;
		public final String firstName;
		public final String lastName;

		public Person() {
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}

		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String newName) {
			firstName = newName;
		}

		public String getLastName() {
			return lastName;
		}
		public void setLastName(String newName) {
			lastName = newName;
		}
	}
}