package com.elsevier.education;

import java.util.Set;
import java.util.TreeSet;

/**
1. Both outter class Exercise1 and the static nested class Person are made final 
so that they cannot be extended.  
 
2. The setters in the static nested class Person were removed so that fields in
Person cannot be set.

3. The fields in the static nested class Person are initialized when the 
Exercise1.Person object is instantiated.  Since the phoneNumbers field is 
mutable, it is initialized with a copy of the phoneNumbers argument in the 
constructor so that any update in the phoneNumbers argument would not affect the
phoneNumbers field.

 */
public final class Exercise1 {
	
	public final static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = new TreeSet(phoneNumbers);
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/**
 		Returns a copy of phoneNumbers so that update in the returned 
		phoneNumbers object would not effect the phoneNumbers field. 
		 */
		public Set<String> getPhoneNumbers() {
			return new TreeSet(phoneNumbers);
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}