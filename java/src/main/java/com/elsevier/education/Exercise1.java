package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.
In order to make class immutable : it should not expose any setters that will change object's state, and class should
be final. One tricky thing here is setters/getters accepting/returning objects (phoneNumbers): if reference gets copied then the state can be changed
as reference points to external location not controlled from the class.

removing setters : need to have constructor that can initialize object
	
*/
public class Exercise1 {

	public static final class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person() {
			//construct with default values not much use here
		}

		/**
		 * @param phoneNumbers
		 * @param firstName
		 * @param lastName
		 */
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			super();
			this.phoneNumbers = getClonedPhoneNumbers(phoneNumbers);
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/*
		 * helper method to generate cloned set
		 */
		private Set<String> getClonedPhoneNumbers(Set<String> phoneNumbers) {
			Set<String> clone = new HashSet<>(phoneNumbers.size());
			return clone;
		}

		public Set<String> getPhoneNumbers() {
			return getClonedPhoneNumbers(phoneNumbers);
		}
		
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			Set<String> clone = new HashSet<>(newPhoneNumbers.size());
			phoneNumbers = clone;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}