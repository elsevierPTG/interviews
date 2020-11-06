package com.elsevier.education;

import java.util.Set;
import java.util.HashSet;

/**

TODO: Make this class immutable.
Remove the setter methods, and then there is no other ways to modified its member variables once the object is initialized.

*/
public class Exercise1 {

	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person() {
		}
		
		public Person(String fisrtName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = new HashSet<>();
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
