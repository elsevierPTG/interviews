package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/

//The class here needs to be made final so that it can't be extended into subclasses
public final class Exercise1 {

	// The inner class here also needs to be made final so that it can't be extended into subclasses
	public static final class Person {
		
		// The variables all need to be made final so that the value can't be changed
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
	/*	
	 * This will contain default values when no arguments are passed. This constructor shouln't be there
	 * This constructor can remain if a "Person" object needs to be created by default,
	 * with a default phone number and name for OTHER parts of the code to work
	 
		public Person() {
			this.phoneNumbers = null;
            this.lastName =  null;
            this.firstName = null;
		}
	*/
		
		// This should be the default constructor used, as it will force values to be set when creating a new person object
		public Person(Set<String> newPhoneNumbers,String newFirstName, String newLastName) {
            this.phoneNumbers = newPhoneNumbers;
            this.lastName =  newLastName;
            this.firstName = newFirstName;
        }
		
		// Keep only getters. All setters will be removed
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