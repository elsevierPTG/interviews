package com.elsevier.education;

import java.util.HashSet
import java.util.Set
/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	//Make this class final so as to make sure this class is not inherited by any other class. This way we can make sure 
	//this class object is not modified.
	public final static class Person {
		
		//make all the variables final so that these variables are not modified else where.
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
 		}

	//Removed all the setter methods inside so that the variables are not modifed anywhere.
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
	
	public static void main(String[] args) {
	//Create HashSet Object
		Set<String> setData = new HashSet<>();		
		setData.add("data element");
		Person personObject = new Person(setData, "firstname", "lastname");
		//Try to add data to the immutable object personObject as shown below, It will throw set is non editable exception.
		try {
			personObject.getPhoneNumbers().add("data element second");
		} catch Exception e) {
			System.out.println("Set is non editable);
 		}
		//Try to remove the existing datqa from the set as shown below, It will throw set is non editable exception.
		try {
			personObject.getPhoneNumbers().remove("data element");
		} catch Exception e) {
			System.out.println("Set is non editable");
		}

 	}
}
