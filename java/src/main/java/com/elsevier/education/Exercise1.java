package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final static class Person {  // Class made Final
		
		private final Set<String> phoneNumbers;  
		private final String firstName;
		private final String lastName;         // all the class varialble made final 
		
		public Person(Set<String> phoneNumbers,String firstName,String lastName) { // Parameterized constructors used to set the values . 
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
		
	// All the setter methods are removed .
}
