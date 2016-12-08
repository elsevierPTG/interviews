package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final static class Person {

		// make instance variables final
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		//default constructor private
		private Person() {
		}

		public Person(Set<String> phones, String first, String last) {
			setFirstName(first);
			setLastName(last);
			setPhoneNumbers(phones);
		}

		// Return a clone of the Set so original can't be modified
		public Set<String> getPhoneNumbers() {
			return phoneNumbers.clone();
		}

		// setters made private,  object instance created as copy instead of referenced
		private void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = new HashSet<String>();
			for (String phoneNum:newPhoneNumbers) {
				phoneNumbers.add(phoneNum);
			}
		}
		
		public String getFirstName() {
			return firstName;
		}
		// setters made private
		private void setFirstName(String newName) {
			firstName = newName;
		}
		
		public String getLastName() {
			return lastName;
		}
		// setters made private
		private void setLastName(String newName) {
			lastName = newName;
		}
	}
}