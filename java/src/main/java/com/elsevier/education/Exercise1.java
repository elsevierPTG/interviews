package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	final public static class Person {
		
		//make data members final private so that it can not be changed outside constructor.
		final private Set<String> phoneNumbers;
		final private String firstName;
		final private String lastName;
		
		public Person(Set<String> phonenumbers, String firstname, String lastname) {
			this.firstName=firstname;
			this.lastName=lastName;
			this.phoneNumber=phonenumbers.clone();
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers.clone();
		}
		//remove all setter methods
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
