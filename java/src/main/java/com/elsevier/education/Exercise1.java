package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
/* immutable class is should be final can't extend to subclass */
	public static final class Person {
	   /*immutable class variable should final	*/
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> pn, String fn, String ln) {
			this.phoneNumbers=pn;
			this.firstName=fn;
			this.lastName=ln;
			

		}
/*only the gettre methoda */		

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
