package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/

/**
 * 
 * @author Rohini Byrishetty
 * To Make a Class immutable, the instance variable of the class should be final and there should not be any setter methods 
 *
 */
public final class Exercise1 {

	//changing class to Final
	private final static class Person {
		
		//changing variables to final 
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person() {
		}

		//cloning the return objects
		public Set<String> getPhoneNumbers() {
			return phoneNumbers.clone();
		}
		
		/*
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		} */
		
		//cloning the return objects
		public String getFirstName() {
			return firstName.clone();
		}
		
		/*
		public void setFirstName(String newName) {
			firstName = newName;
		}*/
		
		//cloning the return objects
		public String getLastName() {
			return lastName.clone();
		}
		
		/*
		public String getLastName() {
			return lastName.clone();
		} */
		
		// Performing the exact copy
		public Person(String firstName, String lastName, Set pN) {
			System.out.println("Performing Deep Copy for Object initialization");
			this.firstName = firstName;
			this.lastName = lastName;
			Set phoneNumbers = new HashSet();
			for (String temp : pN) {
				phoneNumbers.add(temp);
			}
			this.phoneNumbers = phoneNumbers;
		}
	}
}