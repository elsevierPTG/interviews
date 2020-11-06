package com.elsevier.education;

import java.util.Set;
/*
 * A class can be made immutable by 
 * 1. Declaring a class final , so that any other classes cannot extend it.
 * 2. Make the inner class and its members private so that no other class can access it
 * 3. Make all the members in class final so that the member variable's value cannot be changed 
 * 4. Initialize all the variables in the Constructor 
 * 5. Provide only getter methods to access the member variable but not change the actual reference
 */
public final class Exercise1 {
	private final static class Person{
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers,String firstName,String lastName){
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}
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
