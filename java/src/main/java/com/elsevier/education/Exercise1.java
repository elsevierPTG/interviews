package com.elsevier.education;


import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final static class Person {

		// create Hashset so it can be cloned
		private  HashSet<String> phoneNumbers;
		private  String firstName;
		private  String lastName;

		//default constructor private
		private Person() {
		}

		public Person(Set<String> phones, String first, String last) {
			this.firstName = first;
			this.lastName=last;
			setPhoneNumbers(phones);
		}

		// clone the set so original can't be modified
		public Set<String> getPhoneNumbers() {
			return (Set<String>) phoneNumbers.clone();
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