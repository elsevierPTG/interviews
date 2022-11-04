package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
/**

Remove Setter  Methods or create private setters,Made all fields private. Declared the class final.And the constructor was made private.

*/
public final class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private  final String firstName;
		private  final String lastName;
		
		private Person() {
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
		//Either we can remove setter or create private setters
		
		public Set<String> setPhoneNumbers() {
			this.phoneNumbers= phoneNumbers;
		}
		
		
		public String setFirstName() {
			this.firstName=firstName;
		}
	
		
		public String setLastName() {
			this.lastName= lastName;
		}
	
	}
}
