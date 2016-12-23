package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 {

	public final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = Collections.unmodifiableSet(phoneNumbers);
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		/*public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}*/
		
		public String getFirstName() {
			return firstName;
		}
		/*public void setFirstName(String newName) {
			firstName = newName;
		}*/
		
		public String getLastName() {
			return lastName;
		}
		/*public void setLastName(String newName) {
			lastName = newName;
		}*/
	}
}
