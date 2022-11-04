package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static class Person {
		
		// Making the fields final will not allow them to be changed after being set initially
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		// Final fields need to be set in the contstructor 
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		// Remove setters because they would allow the object to be mutable
		
		public String getFirstName() {
			return firstName;
		}
		// Remove setters because they would allow the object to be mutable
		
		public String getLastName() {
			return lastName;
		}
		// Remove setters because they would allow the object to be mutable

	}
}