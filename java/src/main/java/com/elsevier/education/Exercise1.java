package com.elsevier.education;

import java.util.Set;
import java.util.HashSet;

/**

TODO: Make this class immutable.

1. Make class itself final
2. Make all instance variables final
3. Remove set methods (do via constructor, and copy mutable objects)
4. Return deep copy of mutable objects (the Set in this case)

*/
public class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = new HashSet<String>();
			
			if(phoneNumbers != null){
				this.phoneNumbers.addAll(phoneNumbers); //is a way to copy
			}
		}

		public Set<String> getPhoneNumbers() {
			//again, return a copy.  No need to null check, but might be size = 0
			Set<String> tempPhoneNumbers = new HashSet<String>();
			tempPhoneNumbers.addAll(phoneNumbers); 
			return tempPhoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}
