package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
1- Dont allow subclass to override the methods (Make the class as final)
2- Declare the filed as private and as well as final so that we are sure that accidentaly we cant change them.
3- Setter methods are meant to change the state of object.So no need to specify in code.
4- If some muttable properties are there make the defensive copy out of it.

*/
public class Exercise1 {

	public static final class Person {
		
		private Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		//Default private constructor will ensure no unplanned construction of class
		private Person(Set phoneNumbers,String firstName,String lastName) {
				//don't create unnecessary copies of my immutable objects
			   	this.phoneNumbers = Collections.unmodifiableSet(phoneNumbers);
        			this.firstName = firstName;
        			this.lastName = lastName;
		}
		
		   //Factory method to store object creation logic in single place
    		public static Person createNewInstance(Set phoneNumbers,String firstName,String lastName)
    		{
        		return new Person(phoneNumbers, firstName, lastName);
   		 }
 
		
		public Set<String> getPhoneNumbers() {
			   
   		 return phoneNumbers;

		}
		/*public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}*/
		
		public String getFirstName() {
			return firstName;
		}
		/*public void setFirstName(String newName) {
			firstName = newName;
		}*/
		
		public String getLastName() {
			return lastName;
		}
		/*public void setLastName(String newName) {
			lastName = newName;
		}*/
	}
}
