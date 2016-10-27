package com.elsevier.education;

/**

TODO: Make this class immutable.
// final can not be inherit , private const -not able to edit from other class
*/
public class Exercise1 {

	public final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		private Person(String firstName,String lastName,Set<String> phoneNumber) {
			this.firstName =firstName ;
			this.lastName = lastName;
			this.phoneNumber =phoneNumber ;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String newName) {
			firstName = newName;
		}
		
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String newName) {
			lastName = newName;
		}
	}
}
