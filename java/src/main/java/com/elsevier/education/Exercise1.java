package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
	/** Make class  final so that it cannot be extended**/
	public static class Person {
		/** Make all fields private so that direct access is not allowed**/
		/** Make all fields final so that it cannot be modified**/
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		/** initialize phoneNumbers using a new set , so that the original one is not changed**/
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = return new HashSet<String>(phoneNumbers);
		}
		/** Get phoneNumbers in a new set , so that the original one is not changed**/
		public Set<String> getPhoneNumbers() {
			return new HashSet<String>(phoneNumbers);
		}
				
		public String getFirstName() {
			return firstName;
		}
				
		public String getLastName() {
			return lastName;
		}
		
	}
}
