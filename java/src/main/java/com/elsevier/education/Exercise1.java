package com.elsevier.education;

import java.util.*;
/**

TODO: Make this class immutable.

*/
public class Exercise1 {
	// make it final
	public final static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;

		/**
		 * Change the constructor in order to
		 * remove the setters farther down in this
		 * example / test
		 *
		 * @param phoneNumbers Set<String>
		 * @param firstName String
		 * @param lastName String
		 */
		public Person(Set<String> phoneNumbers,
					  String firstName,
					  String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		// remove all setters

		/**
		 * This should be modified so that the original
		 * Set is not returned.
		 *
		 * @return
		 */
		public Set<String> getPhoneNumbers() {
			Set<String> copyOfPhoneNumbers = new HashSet<>();

			for(String phoneNumber: phoneNumbers){
				copyOfPhoneNumbers.add(phoneNumber);
			}

			return copyOfPhoneNumbers;
		}

		
		public String getFirstName() {
			return firstName;
		}

		
		public String getLastName() {
			return lastName;
		}

	}
}