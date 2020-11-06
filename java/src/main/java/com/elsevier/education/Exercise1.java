package com.elsevier.education;

import java.util.Set;

/**

@author Todd Goglia: Made this class immutable by removing setter methods and making the properties final.

*/
public class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}
		
		/**
		 * Creates a clone of the phoneNumbers set and returns the clone. Otherwise, the phone number list itself would be immutable, but
		 * the strings themselves could be changed. Though Strings in java are themselves immutable, so this might not be needed.
		 * @return The cloned set.
		 */
		public Set<String> getPhoneNumbers() {
			Set<String> clone = new TreeSet<String>(Collections.unmodifiableCollection(phoneNumbers));
			return clone;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
	}
}