package com.elsevier.education;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	// cannot be inherited. So, no sub-class can override methods
	public static final class Person {
		// All fields private- we are good
		
		// non immutable. Need to return deep copy so outside classes cannot modify it
		// make it final so reference cannot be changed
		private final Set<String> phoneNumbers;
		
		// immutable type:) we are good
		// adding final so it cannot be changed
		private final String firstName;
		private final String lastName;
		
		// class properties will be initialized in constructor
		public Person(String p_firstName, String p_lastname , Set<String> p_phoneNumbers) {
			this.firstName = p_firstName;
			this.lastName = p_lastname;
			this.phoneNumbers = new HashSet<String>(p_phoneNumbers.size());
			for(String s: p_phoneNumbers){
				this.phoneNumbers.add(s);
			}
		}

		public Set<String> getPhoneNumbers() {
			// deep cloned copy of original object
			// cannot use copy constructor or clone since those operation provide shallow copy
			Set<String> deepcloned = new HashSet<String>(this.phoneNumbers.size());
			for(String s: this.phoneNumbers){
				deepcloned.add(s);
			}
			return deepcloned;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public String getFirstName() {
			return firstName;
		}

		// No setters once class is initialized
		
//		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
//			phoneNumbers = newPhoneNumbers;
//		}
//		
		
//		public void setFirstName(String newName) {
//			firstName = newName;
//		}
//		
		
//		public void setLastName(String newName) {
//			lastName = newName;
//		}
	}
}