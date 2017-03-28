package com.elsevier.education;

import java.util.Set;

/**

DONE: Make this class immutable.

EXPLANATION: To force immutability, I removed the "setters" and
default constructor, made the three instance variables final,
and added a new constructor which receives the values of all
three instance values.

*/
public class Exercise1 {

	public static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
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
