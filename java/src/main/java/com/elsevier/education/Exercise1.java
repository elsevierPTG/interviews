package com.practice.tree.traversal;

import java.util.Set;

/**
TODO: Make this class immutable.
*
* Actions: 
* Declared the class final - Class cannot be extended
* Declared the fields as private to restrict access
* Deleted setter methods for the variables
* Built a constructor to Initialize all fields		  
*/
public class Exercise1 {

	public final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
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
