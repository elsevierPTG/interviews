package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
// Ensure both classes are final so they cannot be mutated after instantiation
public final class Exercise1 {

	public final static class Person {
      /**
       * All the setters have been removed as providing setter methods would violate the immutability
       * of the class
       */

        // Enusre variables are final so they cannot be mutated
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

        // Fill out the constructor so that the members are set upon class instantiation
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

        // Return a copy of the phone numbers, not the reference pointer
		public Set<String> getPhoneNumbers() {
			return new HashSet<String>(){{addAll(phoneNumbers);}};
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
	}
}
