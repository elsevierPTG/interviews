package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	/**
	 * This class is initialized using constructor and have no mutator (setter) methods, which makes the class immutable.
	 * Once initialized, you cannot change the values.
	 * 
	 * Note that phone numbers are kept in the Set type. To prevent modification of the person's phone numbers, the original Set
	 * is copied during construction of the object. See main() method for demonstration.
	 * 
	 * @author Alex
	 *
	 */
	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = new HashSet<String>(phoneNumbers);
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
	}
	
	public static void main(String[] args) {
		
		HashSet<String> phoneNumbers = new HashSet<String>();
		phoneNumbers.add("215-555-5555");
		Person alex = new Person(phoneNumbers, "Alex", "Koyfman");
		System.out.println(alex.getPhoneNumbers()); // Alex's phone numbers
		
		phoneNumbers.add("215-444-4444"); // Modifying original phone numbers object (adding new number)
		System.out.println(alex.getPhoneNumbers()); // Alex's phone numbers did not change
	}
}