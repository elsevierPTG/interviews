package com.elsevier.education;

/**

TODO: Make this class immutable.

Added a new constructor to initialize the person.
Removed the methods which allow the person object to modify to make it immutable.

*/
public class Exercise1 {

	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person() {
		}
		
		public Person( String fName, String lName, Set<String> pNumbers){
			this.firstName = fName;
			this.lastName = lName;
			this.phoneNumbers = pNumbers;
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