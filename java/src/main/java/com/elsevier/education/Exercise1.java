package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String first_name, String last_name, Set<String> phone_numbers) {
			this.firstName = first_name;
			this.lastName = last_name;
			this.phoneNumbers = phone_numbers;
		}

		public Set<String> getPhoneNumbers() {
			Set<String> pn = new HashSet<String>();
			pn.addAll(this.phoneNumbers);
			return pn;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}