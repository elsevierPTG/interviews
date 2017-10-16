package com.elsevier.education;

import java.util.Set;
import java.util.stream.Collectors;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String fname, String lname, Set<String> phoneNos) {
			this.firstName = fname;
			this.lastName = lname;
			Set<String> tmpSet = phoneNos.stream().collect(Collectors.toSet());
			this.phoneNumbers = tmpSet;
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
	}
}