package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public  final class Exercise1 {

	public final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName,String lastName,set<String> phoneNumbers) {

                this.firstName=firstName;
                this.lastName=lastName;
                this.phoneNumbers=phoneNumbers;
                
             
		}

		
		
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
                
                public Set getPhoneNumbers(){

                   return collection.Unmodifible(phoneNumbers);
		

	}
}


1.we have to make this class as a final.
2.we have to create a parameterized constructor.
3. all the string variables are final variables.
3.we have to put getters only,  need to remove the setters.
