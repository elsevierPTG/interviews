package com.elsevier.education;

import java.util.Set;
import static java.lang.System.out;
/**
Add final keyword/modifier to make immutable
*/

public class Exercise1 {

	// add final keyword here for Person class
	public final static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person() {
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		
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
	
	// cannot do this
	public class AnotherPerson extends Person {
	
		public void doSomethingMore() {
			out.println("Something more");
		}
	}
}