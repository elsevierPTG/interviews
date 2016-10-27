package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
 Answer: Don't expose  setters

*/
public class Exercise1 {

	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person() {
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		//Making immutable
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}
		//Making immutable
		public void setFirstName(String newName) {
			firstName = newName;
		}
		
		public String getLastName() {
			return lastName;
		}
		//Making immutable
		public void setLastName(String newName) {
			lastName = newName;
		}
	}
}