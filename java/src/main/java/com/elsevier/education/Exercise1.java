package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/


/**

 TODO: Make this class immutable.

 */
public class Exercise1 {

	public final static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}


		public Set<String> getPhoneNumbers() {
			return Collections.unmodifiableSet(phoneNumbers);
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}

	}


}