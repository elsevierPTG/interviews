package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
	// Marking Person class final so that it cannot be extended by another class
	public static final class Person {
		
		// Marking all variables as final so that values once initialized, cannot be set again.
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		// Instead of default constructor, constructor with deep copy of all fields is added, so that all fields within 
		// immutable class are initialized during construction itself.
		
		/*public Person() {
		}*/
		
		
		public Person(Set<String> phoneNums, String firstName, String lastName){			
			this.phoneNumbers = new HashSet<String>();
			for(String phoneNum : phoneNums){
				this.phoneNumbers.add(phoneNum);		
			}
			this.firstName =  firstName;
			this.lastName =  lastName;
		}		
		
		// All setter methods are removed. Final variables once constructed during construction, cannot be changed again.
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		/*public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}*/
		
		public String getFirstName() {
			return firstName;
		}
		/*public void setFirstName(String newName) {
			firstName = newName;
		}*/
		
		public String getLastName() {
			return lastName;
		}
		/*public void setLastName(String newName) {
			lastName = newName;
		}*/
	}
}
