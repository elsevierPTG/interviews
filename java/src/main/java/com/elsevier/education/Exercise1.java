package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

Explanation: To make a class immutable we have to -
			1. mark it as final (so it won't be extended)
			2. make all of the member variables to be final (so they do not change value)
			3. not have any method in class which can change the value of any of the member variables (like setter method or parameterized constructors)
*/
public final class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person() {
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