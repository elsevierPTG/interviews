package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(final Set<String> phoneNumbers, final String firstName, final String lastName) {
			//Create a deep clone of this set, no way to guarantee the set is an immutable implementation.
			//Don't use clone, it's broken.
			this.phoneNumbers = new HashSet<>();
			this.phoneNumbers.addAll(phoneNumbers);
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public final Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		public final String getFirstName() {
			return firstName;
		}
		
		public final String getLastName() {
			return lastName;
		}
	}
}