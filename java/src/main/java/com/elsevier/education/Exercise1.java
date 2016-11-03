package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 {

	private final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		private final Person(String newFirstName, String newLastName,Set<String> newPhoneNumbers) {
		this.firstName=newFirstName;
			this.lastName=newLastName;
			this.phoneNumbers=newPhoneNumbers;
				
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
