package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
To make class immutable: 
-removed setters
-set class to final and private
-initialized person method
-Straightforward approach to remove mutability
*/
final public class Exercise1 {

	final public static class Person {
		
		
		private final String firstName;
		private final String lastName;
		private final Set<String> phoneNumbers;
		
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName)) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}


		
		public String getFirstName() {
			return firstName;
		}

		
		public String getLastName() {
			return lastName;
		}

	}
}
