package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/**
		 * We have 3 options here:
		 * 		immutable set wrapper
		 * 		shallow copy when we are working with primitives and Strings
		 * 		deep copy when we are working with objects
		 *
		 * deep copy is good when we know set implementation class
		 *
		 * unmodifiableSet cons:
		 * 		* class clients are restricted with add/delete operations
		 *
		 * @return unmodifiable set to avoid add/delete operations
		 */
		public Set<String> getPhoneNumbers() {
			//return phoneNumbers.stream().collect(Collectors.toSet());
			return Collections.unmodifiableSet(phoneNumbers);
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}

	public static void main(String[] args) {
		Set<String> strings = new HashSet<>();
		strings.add("set_element1");
		Person newPerson = new Person(strings, "first", "last");
		try {
			newPerson.getPhoneNumbers().add("set_element2");
		} catch (UnsupportedOperationException e) {
			System.out.println("Sorry! You can't add to immutable set");
		}
		try {
			newPerson.getPhoneNumbers().remove("set_element1");
		} catch (UnsupportedOperationException e) {
			System.out.println("Sorry! You can't do remove in immutable set");
		}

	}
}