package com.elsevier.education;

import java.util.Collections;
import java.util.Set;

/**

TODO: Make this class immutable.
Steps : 1. marking the class as final so that it cant be extended
		2. marking all th instance variables as final, so that those cant be modified
		3. removing all the setter so that the values cant be set using setters
		4. special case - Set is immutable, so making it unmodifiable
		5. creating the constructor with the params during for the object initialization during the cration time.
*/
public class Exercise1 {
	//Marking the class as final, as to avoid further extension
	public final static class Person {
		//Marking variables as final as to avoid further change in the values
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		/**
		 * Constructor
		 * @param firstName
		 * @param lastName
		 * @param phoneNumbers
		 */
		public Person(String firstName, String lastName, Set<String>phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			//handling special case - Set is Mutable, hence calling Collections.UnmodifiableSet to make sure that he values 
			//can't be changed after the object creation
			this.phoneNumbers = Collections.unmodifiableSet(phoneNumbers);
		}

		/**
		 * @return set of phoneNumbers
		 */
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		/**
		 * 
		 * @return firstName
		 */
		public String getFirstName() {
			return firstName;
		}
		
		/**
		 * @return lastName
		 */
		public String getLastName() {
			return lastName;
		}
		
	}
}