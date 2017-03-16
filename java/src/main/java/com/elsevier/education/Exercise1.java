package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
1.) Make Exercise1 Final.
2.) Make Person private so it can only be used in Exercise1
3.) Make all member variables final private so they can only accessible within Exercise1
4.) Convert all setter method private.
@author John Lo

*/
final public class Exercise1 {

	private static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		private Person() {
		}

		private Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		private void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		
		private String getFirstName() {
			return firstName;
		}
		private void setFirstName(String newName) {
			firstName = newName;
		}
		
		public String getLastName() {
			return lastName;
		}
		private void setLastName(String newName) {
			lastName = newName;
		}
	}
}