package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName,String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			
			this.phoneNumbers = new HashSet<String>();			
			for(String phoneNumber : phoneNumbers){
			   this.phoneNumbers.add(phoneNumber);
			}
		}
		
		
		public Set<String> getPhoneNumbers() {
			HashSet<String> setPhoneNumber = new HashSet<String>();
			
			for(String phoneNumber : phoneNumbers){
				System.out.println(phoneNumber);
				setPhoneNumber.add(phoneNumber);
			}
			
			return setPhoneNumber;
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		
	}
}
