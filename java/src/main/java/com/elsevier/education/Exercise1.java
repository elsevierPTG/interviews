package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static final class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person() {
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		private Person(String firstName, String lastName, set<String> phoneNumbers)
		{
			this.firstName= firstName;
			this.lastName= lastName;
			this.phoneNumbers= phoneNumbers;
	}
		public static Person createInstance(String fn, String ln, Set<String> pn)
		{
			return new Person(fn, ln, pn);
		}
}
