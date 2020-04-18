package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
 removed setters and made things final, was thinking of builder to make it easy instead of constructor
 but figured it was good enough.

*/
public class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers,
					  String firstName,
					  String lastName) {
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