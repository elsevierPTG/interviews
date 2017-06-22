package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

Declared Exercise1 class as final and person class as finla

*/
public class Exercise1 {

	public static class Person {
		
		final private Set<String> phoneNumbers;    
		final private String firstName;    
		final private String lastName;      
		
		public Person(Set ph, String fn, String ln) {    
			phoneNumbers = ph;   
			firstName = fn;   
			lastName = ln;    
		} 

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		/*
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		*/
		
		public String getFirstName() {
			return firstName;
		}
		/*
		public void setFirstName(String newName) {
			firstName = newName;
		}
		*/
		public String getLastName() {
			return lastName;
		}
		/*
		public void setLastName(String newName) {
			lastName = newName;
		}
		*/
	}
}
