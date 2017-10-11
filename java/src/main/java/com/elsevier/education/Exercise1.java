package com.elsevier.education;

import java.util.Collections;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person(Set<String> newPhoneNumbers, String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			
			//this is done so that the collection cannot escape he object and ensure null safety.
			if (newPhoneNumbers != null) {
				this.phoneNumbers = Collections.unmodifiableSet(newPhoneNumbers); 
			} else {
				this.phoneNumbers = Collections.emptySet();
			}
		}

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