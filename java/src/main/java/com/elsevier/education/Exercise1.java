package com.elsevier.education;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

/**

Person class is immutable, because it is final
 and it's fields are final, not immutable.

*/
public class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers.stream().map(String::new).collect(Collectors.toSet());
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

	}
}