package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/


public  class Exercise1 {

	//Declare class as final so it cant be extended.
	public static final class Person {
		
		//Make mutable fields final so its value can be assigned only once.
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		//Initialize the field via constructor
		public Person(Set<String> phone, String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNumbers = phone;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		//no setter methods for variables.
		
		/* public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		} */
		
		public String getFirstName() {
			return firstName;
		}
		/* public void setFirstName(String newName) {
			firstName = newName;
		} */
		
		public String getLastName() {
			return lastName;
		}
		/* public void setLastName(String newName) {
			lastName = newName;
		} */
	}
}