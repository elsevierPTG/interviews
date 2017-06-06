package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
//Make class as final so we can not create subclass
public final class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private finalString firstName;
		private finalString lastName;
		// parameterised constructor is done to assign the value to all the final class variable during object initialisat
		public Person() {
		}
		 public Person(Set<String> newPhoneNumbers,String newFirstName, String newLastName) {
            this.phoneNumbers = newPhoneNumbers;
            this.lastName =  newLastName;
            this.firstName = newFirstName;
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
