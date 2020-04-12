package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
	
/**
 * Class and instance variables must be declared final to be immutable
 */
	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		/* The initialization method must include all instance parameters,
		 * as they cannot be changed once initialized.
		 * 
		 */
		public Person(Set<String> pNumbers, String fName, String lName) {
			this.phoneNumbers = pNumbers;
			this.firstName = fName;
			this.lastName = lName;
		}
		
		/*
		 * All setters must be removed for this class to be immutable.
		 * The code would not compile with setters if the instance variables are final.
		 * 
		 */

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