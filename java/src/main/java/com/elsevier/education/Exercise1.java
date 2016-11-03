package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers,String firstName,String lastName) {
			this.phoneNumbers=phoneNumbers;
			this.firstName=firstName;
			this.lastName=lastName;
			
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
