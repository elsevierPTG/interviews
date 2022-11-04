package com.elsevier.education;

import java.util.Set;
import java.util.stream.Collectors;

/**
	@author James Herndon james.herndon@gmail.com 
	@version 1.01 Made the nested Person class immutable.
	Immutability checklist:
		1. Final class so it can't be extended
		2. All fields are private
		3. Eliminate setter methods. 
			I chose to remove these, changing the interface.
			The other option, throwing a "Not Implemented" RuntimeException
			seemed inappropriate since calling code will have them differently in
			any case.
		4. Fields are final and can only be assigned once.
		5. Constructor initialization using deep copy.
		6. For object fields return a copy, rather than object reference.

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
			return phoneNumbers.stream().collect(Collectors.toSet());
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}