package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/

/**
 * Make the class final so no instances can be assigned to the memory once created
 * Mark mutable objects as final
 * Remove all setter methods
 * Introduce parameters in constructor
 * deep copy mutable object so when retrieving, only a copy is returned
 */
public class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers = new HashSet<>();
		private String firstName;
		private String lastName;
		
		public Person(Set<String>  phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers.addAll(phoneNumbers);
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			Set<String> copySet = new HashSet<>();
			copySet.addAll(phoneNumbers);
			return copySet;
		}
		/*private void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}*/
		
		public String getFirstName() {
			return firstName;
		}
		/*private void setFirstName(String newName) {
			firstName = newName;
		}*/
		
		public String getLastName() {
			return lastName;
		}
		/*private void setLastName(String newName) {
			lastName = newName;
		}*/
	}
}