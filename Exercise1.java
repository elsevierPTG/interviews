package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person(Set<String> newPhone,String newFName,String newLName) {
			setPhoneNumbers(newPhone);
			setFirstName(newFName);
			setLastName(newLName);
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		private void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}
		private void setFirstName(String newName) {
			firstName = newName;
		}
		
		public String getLastName() {
			return lastName;
		}
		private void setLastName(String newName) {
			lastName = newName;
		}
	}
}