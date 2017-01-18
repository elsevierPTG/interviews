package com.elsevier.education;

import java.util.Set;
import java.util.HashSet;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			Set<String> tempSet = new HashSet<String>();
			tempSet.addAll(phoneNumbers);
			/*
			 * Creating a copy of phoneNumbers so that changes made to the actual Set passed as argument will not reflect
			 * in the set belonging to Person class
			 * But it has a side effect that it will transform the set passed as HashSet always.
			 */
			this.phoneNumbers = tempSet;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			Set<String> tempSet = new HashSet<String>();
            		tempSet.addAll(phoneNumbers);
			/*
			 * Creating a copy of phoneNumbers so that changes made to result sent will not reflect in the set belonging to
			 * Person class
			 */
			return tempSet;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
	}
}
