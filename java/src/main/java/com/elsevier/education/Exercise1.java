package com.elsevier.education;

import java.util.Set;
import java.util.Collections;
import java.util.stream.Collectors; 

public  class Exercise1 {
	/**
	TODO:Make this class immutable
	*/

	public final static class Person {  //make class as final
		
		//set all varibales as final
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public person(){
		}
		public Person(final Set<String phoneNumbers,final String fisrtName,final String lastName>){
			this.phoneNumbers = phoneNumbers.stream().collect(Collectors.toSet()); 
			this.firstName=fisrtName;
			this.lastName=lastName;
		}
		
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		//unmodifiableset will create read only set of phoone numbers
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers=newPhoneNumbers;
			return Collections.unmodifiableSet(phoneNumbers); 		
}
		
		/**Since Strings are immutable no need to do anything
		*/
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
