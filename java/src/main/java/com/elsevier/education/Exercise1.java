package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final class Person {
		
		rivate final Set<String> phoneNumbers;
		private final  String firstName;
		private final  String lastName;
		
		public Person(Set<String> newPhoneNumbers,String newFirstName, String newLastName) 
		{
		this.phoneNumbers = newPhoneNumbers;
		this.lastName = newName;
		this.firstName = newName;
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
