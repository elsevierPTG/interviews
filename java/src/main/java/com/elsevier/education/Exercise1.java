package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	//Class which is marked as final cannot be changed / inherited thus makes it an immutable class
	public final class Person {

		//making all the  variables as final will not let other to mutate
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person() {
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