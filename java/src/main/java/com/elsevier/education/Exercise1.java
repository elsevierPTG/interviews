package com.elsevier.education;

import java.util.Set;
import java.util.stream.Collectors;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			/*
			 * Creating the copy of phoneNumbers to isolate the internal 
			 * state of object from external modification.
			 * 
			 * Below change might have some side effect because it will 
			 * convert the client provided Set e.g TreeSet/Custom set implementation
			 * into Hashset. 
			 */
			this.phoneNumbers = phoneNumbers.stream()
					                        .collect(Collectors.toSet());
		}

		public Set<String> getPhoneNumbers() {
			/*  Creating the copy of phoneNumbers to isolate the internal 
			 * state of object from external modification.
			 */
			return phoneNumbers.stream()
                               .collect(Collectors.toSet());
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}