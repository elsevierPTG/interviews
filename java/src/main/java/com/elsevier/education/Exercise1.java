package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
//use final keyword so taht no subclass can override the methods of 
//class hence can be made immutable
	public final static class Person {
		//we need to make all fields final so that it's value can be assigned only once
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person() {
		}
		//public constructor is made to get values for all required immutable fields,that can be 
		//initialized during construction itself
		public Person(String firstName,String lastName,Set<String> phoneNumbers)
		{
			this.firstName=firstName;
			this.lastName=lastName;
			Set<String>tempSet=new Set<String>();
			Iterator<String>ut=phonenumbers.iterator();
			while(it.hasNext())
			{
				tempSet.add(it.next);
			}
			this.phonenumbers=tempSet;
		}
		//setters are not needed while making a class immutable
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
			//new instance of phonenumbers is created to keep earlier values only
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
