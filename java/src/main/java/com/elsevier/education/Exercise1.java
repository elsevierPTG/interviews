package com.elsevier.education;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * Making this class immutable. Changes: made class definition and field final
 * removed Setter methods Changed ctor to accept properties as a ctor dependency
 */
public class Exercise1 {

	public final static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = new HashSet<String>();
			Iterator<String> iterator = phoneNumbers.iterator();
			while (iterator.hasNext()) {
				this.phoneNumbers.add(iterator.next());
			}
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