package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
	//making class final to make it immutable, so that cannot be extended.
	public final class Person {
		
		//immutable class should have final variables - not to allow direct access.
		final private Set<String> phoneNumbers;
		final private String firstName;
		final private String lastName;
		
		//setting values in constructor to avoid setters which can modify the values later.
		public Person(Set<String> strSet, String fName, String lName) {
			this.phoneNumbers=strSet;
			this.firstName=fName;
			this.lastName-lName;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		//avoiding setter methods
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
