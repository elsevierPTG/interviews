package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	/*To make class as immutable, use final keyword such that no subclass can inherit its property.*/
	public final class Person {
		/* Make field as final so that it’s value can be assigned only once*/
		private final Set<String> phoneNumbers;
		/* Make field as final so that it’s value can be assigned only once*/
		private final String firstName;
		/* Make field as final so that it’s value can be assigned only once*/
		private final String lastName;
			
		/* Populating Constructor as final data member can be initialized only through this */
		public Person(String firstName,String lastName,Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}
		
		/* No setter method required as all data members are in final, it will be initialized only through constructor */

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
				
		public String getFirstName() {
			return firstName;
		}
				
		public String getLastName() {
			return lastName;
		}
		
	}
}
