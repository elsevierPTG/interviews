package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
//Add final in the class definition to restrict extending the Person Class
	public final static class Person {
		
		//Add final before the variable declaration to control the variable changes
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		//Add parameters to the constructor to pass the Values to the varaiables
		public Person(Set<String> phoneNumbers,String firstName,String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}
 		//Remove the setters for restricting the Variable changes and also add the unmodifiableset to restrict modifications in set
		public Set<String> getPhoneNumbers() {
			return Collections.unmodifiableSet(phoneNumbers);
		}
				
		public String getFirstName() {
			return firstName;
		}
				
		public String getLastName() {
			return lastName;
		}
		
	}
}
