package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
	/*class to be made final*/
	public final class Person {
		/* all the variables to be made final so that value is declared only once*/
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		/*initializing values in constructor*/
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
		/*return clone of mutable objects*/
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
