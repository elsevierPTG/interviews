package com.elsevier.education;

import java.util.Collections;
import java.util.Set;

/**

I got rid of the setters instead of changing them such that they returned
an immutable copy of the Person object with that one field changed since
the instructions only say "Make this class immutable", but if that was the
intention, those getters would look like this:

		public Person setFirstName(String newFirstName) {
			return new Person(phoneNumbers, newFirstName, lastName);
		}

*/
public class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		/** Guava's ImmutableSet::copyOf is truly immutable, but Guava 
		 * isn't in build.gradle, so I went with the standard library here.
		 */
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = Collections.unmodifiableSet(phoneNumbers);
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