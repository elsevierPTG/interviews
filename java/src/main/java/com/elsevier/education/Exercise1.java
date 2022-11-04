package com.elsevier.education;

import java.util.Set;

public class Exercise1 {

	// add final to class definition
	public static final class Person {
		
		/* make all mutable fileds final and private to prevent modify from outside */
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		/* initiate the mutable field from the class constructor */
		public Person(Set<String> phoneNumbers,String firstName,String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;

		}

		/* remove setter */
/*		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
*/
		/* public void setPhoneNumbers(Set<String> newPhoneNumbers) {
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