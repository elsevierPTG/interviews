package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.
1. Remove set methods.
2. Add constructor to set the fields.
3. Return a copy of the collections so the original collection won't be modified.

*/
public class Exercise1 {

	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person(String firstName,
				      String lastName,
				      Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}

		/**
		 * Create a set and return so the calling program can't change phone numbers in the original set.
		 * @return
		 */
		public Set<String> getPhoneNumbers() {
			Set<String> newPhoneNumbers = new HashSet<>();
			newPhoneNumbers.addAll(this.phoneNumbers);
			return newPhoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}