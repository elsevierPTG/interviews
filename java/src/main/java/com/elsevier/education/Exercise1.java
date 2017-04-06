package com.elsevier.education;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
/**

TODO: Make this class immutable.

*/
public class Exercise1 {
	//Declare the class as final so it can’t be extended
	public final static class Person {
		//Make all mutable fields final so that it’s value can be assigned only once.
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		//Don’t provide setter methods for variables.Initialize all the fields via a constructor performing deep copy.
		public Person(Set<String> phoneNumbers,String firstName,String lastName) {
			Set<String> tempSet = new HashSet<>();
			Iterator<String>  iterator = phoneNumbers.iterator();
			while(iterator.hasNext()){
				tempSet.add(iterator.next());
			}
			this.phoneNumbers = tempSet;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		//Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
		public Set<String> getPhoneNumbers() {
			return (Set<String>) ((HashSet<String>)phoneNumbers).clone();
		}
				
		public String getFirstName() {
			return firstName;
		}
				
		public String getLastName() {
			return lastName;
		}
		
	}
}