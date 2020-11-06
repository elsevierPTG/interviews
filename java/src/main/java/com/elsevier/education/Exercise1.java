package com.elsevier.education;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

/**

TODO: Make this class immutable.

 Make the class final to prevent subclassing
 Remove methods that modify the attributes
 Create new Set since the invoking class has a reference
 Make the Set unmodifiable since the getter will return the Set which could be modified.
 Make attributes final.

*/
public class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = Collections.unmodifiableSet(new HashSet<>(phoneNumbers));
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