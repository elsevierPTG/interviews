package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.
To make this immutable I add fields to the constructor while making both properties final. However, to make
 phone numbers Immutable we would have to use an ImmutableSet from Guava or another library. This is because if we
 keep the getter for the phoneNumbers set, this references the object and the user can still add or remove items.
 A way around this is to always return a copy of the set instead of the initial set
*/
public class Exercise1 {

	public static class Person {
		
		// this does not make this immutable
		private final Set<String> phoneNumbers;

		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}

		public Set<String> getPhoneNumbers() {
			Set<String> copySet = new HashSet<>();
			for (String s : phoneNumbers) {
				copySet.add(s);
			}

			return copySet;
		}
		
		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}
	}
}