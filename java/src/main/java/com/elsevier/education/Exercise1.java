package com.elsevier.education;

import java.util.Collections;
import java.util.Set;

/**
TODO: Make this class immutable.
*/
public class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		//Private Constructor 
		private Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		//Factory method to create new Person instance
		public static Person getNewPerson(Set<String> phoneNumbers, String firstName, String lastName){
			return new Person(phoneNumbers, firstName, lastName);
		}
		
		public Set<String> getPhoneNumbers() {
			//Returning immutable Set
			return Collections.unmodifiableSet(phoneNumbers);
		}
		
		//Removed setter methods
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
