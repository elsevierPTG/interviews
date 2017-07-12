package com.elsevier.education;

import java.util.Set;

/**

DONE: Make this class immutable.

FIXes:
	1) declare class final so it cannot be subclassed
	2) make all member fields private (so even if could be subclassed, variables are invisible to everyone outside class)
	3) remove setters - only set at construction
	4) make mutable fields final - set only in constructor
	5) avoid returning member references in gettors - return copy references instead (did this on firstname/lastname)
*/
public  class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String aFirstName, String aLastName, Set<String> aPhoneNumberList) {
			this.firstName = aFirstName;
			this.lastName = aLastName;
			this.phoneNumbers = aPhoneNumberList;
		}

		public Set<String> getPhoneNumbers() {
			
			return phoneNumbers;
		}
		
		public String getFirstName() {
			String returnFirstName = firstName;
			return returnFirstName;
		}
		
		public String getLastName() {
			String returnLastName = lastName;
			return returnLastName;
		}
		
	}
}
