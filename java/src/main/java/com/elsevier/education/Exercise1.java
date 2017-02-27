package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
	/*To make the class as immutable, we need to use final keyword.*/
	public  final static class Person {
		/* Make all fields final so that it’s value can be assigned only once*/
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName,String lastName,Set<String> phoneNumbers) {
			this.firstName = firstName;
 			this.lastName = lastName;
 			Set<String> tempSet = new Set<String>();
 			Iterator<String> it = phoneNumbers.iterator();
 			while(it.hasNext()){
 				tempSet.add(it.next);
 			}
 			this.phoneNumbers = tempSet;
		}

		public Set<String> getPhoneNumbers() {
			return (Set<String>)phoneNumbers.clone();
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		
	}
}
