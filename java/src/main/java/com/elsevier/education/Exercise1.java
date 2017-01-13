package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

Moved variable initializations to constructor, rather than set methods.
Variables themselves are final.
Class is final so it cannot be extended.

*/
public class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> newPhoneNumbers, String newFirstName, String newLastName) {
			phoneNumbers = newPhoneNumbers;
			firstName = newFirstName;
			lastName = newLastName;
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