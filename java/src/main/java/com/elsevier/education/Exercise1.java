package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
/**

Removed Setter  Methods,Made all fields private. Declared the class final.And the constructor was made private.

*/
public final class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private  final String firstName;
		private  final String lastName;
		
		private Person() {
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
