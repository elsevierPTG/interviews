package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
	- Class is made immutable by changing fields(as private)/class as final.

*/
public final class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers,String firstName,String lastName) {
			this.phoneNumbers=phoneNumbers;
			this.firstName=firstName;
			this.lastName=lastName;
		}
		
		/*public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}*/
		
		/*public void setFirstName(String newName) {
			firstName = newName;
		}*/
		/*public void setLastName(String newName) {
			lastName = newName;
		}*/
		
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
