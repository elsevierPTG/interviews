package com.elsevier.education;

import java.util.Set;
import java.util.Collections;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {  
    //Making the class final means it can't be extended, which means someone can't make a mutable subclass of a supposedly immutable class 
	public final static class Person {
		
		//The variables are private and final, so they can neither be accessed nor changed when set
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person() {
			phoneNumbers = null; //I need to explicitly initialize this in order to use unmodifiableSet without getting a compilation error
			firstName = null;
			lastName = null;
		}

		//Because Set is a mutable class, it is safest to return a defensive copy of the set
		public Set<String> getPhoneNumbers() {
			return Collections.unmodifiableSet(phoneNumbers);
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}