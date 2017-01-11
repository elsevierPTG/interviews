package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
-- To make class immutable: - Make class as final
	  							  - Make Data Members as final
	  							  - No Setter Method
*/
public final class Exercise1 {

public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		//Constructor to pass Person fields
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			super();
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		/*public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		*/
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