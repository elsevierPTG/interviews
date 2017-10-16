package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

 [aziring] To create an immutable class, do the following: <br>
 <ul>
 <li>Make the class and all of its attributes final</li>
 <li>Remove all setters</li>
 <li>Initialize attributes in the constructor with a deep copy</li>
 <li>Return cloned objects in the getters</li>
 </ul>

*/
public final class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String phoneNumbers> phoneNumbers, String firstName, String lastName) {
			// use a deep copy for object initialization
			this.phoneNumbers = new HashSet<>();
			for(String phone : phoneNumbers) {
				this.phoneNumbers.add(phone);
			}
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			Set<String> clonePhoneNumbers = new HashSet<>();
			clonePhoneNumbers.addAll(phoneNumbers);

			return clonePhoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}