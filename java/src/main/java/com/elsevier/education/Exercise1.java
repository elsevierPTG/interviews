package com.elsevier.education;

/**
TODO: Make this class immutable. 
Modified the class to final, Added the Factory method to store the object creation, commented all the setters method 
and modified the fields to final
*/

public final class Exercise1 {
	
	public static Exercise1 createNewInstance(Set<String> phoneNumbers, String firstName, String lastName)
	{
		return Person.createNewInstance(phoneNumbers, firstName, lastName);
	}

	public final static class Person {
		
		/*
		 * modified the fields to final
		 */
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		//Factory method to store object creation logic in single place
	    public static Person createNewInstance(Set<String> phoneNumbers, String firstName, String lastName)
	    {
	        return new Person(phoneNumbers, firstName, lastName);
	    }
		

		/*public Person() {
		}*/

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
