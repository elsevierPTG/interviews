package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

 1. Modified the fields to be final.  Not wholly necessary but serves to prevent accidental mutation from within the class
 2. Removed mutable accessor methods.
 3. Added constructor which accepts the field values
 4. Copied the contents of the provided Set into a new HashSet so that changes to the original set would not be reflected
 5. Used Collections.unmodifiableSet to wrap the new HashSet in an immutable wrapper so that consumers of getPhoneNumbers
    could not modify the contents.
*/
public class Exercise1 {

	public static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = Collections.unmodifiableSet(new HashSet<String>(phoneNumbers));
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