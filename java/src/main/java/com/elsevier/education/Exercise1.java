package com.elsevier.education;

import java.util.LinkedHashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/

// Declare class as final in order to prevent subclass from altering the object state
public final class Exercise1 {

	public static class Person {
		
		// All fields of Immutable class should be final.
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		// Updated the constructor.		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			// Changes to initialize the instance variables during construction
			this.firstName = firstName;
			this.lastName = lastName;
			
			// create a new LinkedHashSet in order to retain the ordering of the elements
			// and to ensure the object state is not modified by the calling method
			this.phoneNumbers = new LinkedHashSet<String>(phoneNumbers);
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}
		
		public Set<String> getPhoneNumbers() {
			// create and return a new object to ensure internal state of the object
			// is not modified by the calling program
			Set<String> setPhoneNumbers = new LinkedHashSet<String>(phoneNumbers); 
			return setPhoneNumbers;
		}
		
		// Immutable object cannot be modified after construction		
		// Removed the setter
		/*
		public void setFirstName(String newName) {
			firstName = newName;
		}
		*/
		
		// Removed the setter
		/*
		public void setLastName(String newName) {
			lastName = newName;
		}
		*/

		// Removed the setter
		/*
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		*/

	}
}