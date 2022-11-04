package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Made the members 'final' and 'phoneNumbers' unmodifiable 
 * but it will still allow the underlying data to change if the original reference
 * is held elsewhere.
 * I do not think the author intended adding library like guava and
 * using its ImmutableSet or anything more complicated.
*/
public class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> newPhoneNumbers, String firstName, String lastName) {
			phoneNumbers = Collections.unmodifiableSet(newPhoneNumbers);
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
//		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
//			phoneNumbers = newPhoneNumbers;
//		}
		
		public String getFirstName() {
			return firstName;
		}
		
//		public void setFirstName(String newName) {
//			firstName = newName;
//		}
		
		public String getLastName() {
			return lastName;
		}
		
//		public void setLastName(String newName) {
//			lastName = newName;
//		}
	}
	
	// Quickly checking code works.
	public static void main (String args[]) {
		Set<String> phoneNumbers = new HashSet<>();
		phoneNumbers.add("215-000-0000");
		phoneNumbers.add("610-000-0000");
		
		String firstName = "Test";
		String lastName = "Er";
		
		Person person = new Person(phoneNumbers, firstName, lastName);
		
		System.out.println( String.format("First Name: %s\nLast Name: %s\nPhone Numbers: %s\n", 
				person.getFirstName(), person.lastName, person.getPhoneNumbers().toString()) );
		
		Set<String> newPhoneNumbers = new HashSet<>();
		newPhoneNumbers.add("267-000-0000");
		newPhoneNumbers.add("484-000-0000");
		
		person.getPhoneNumbers().addAll(newPhoneNumbers);
		System.out.println( String.format("First Name: %s\nLast Name: %s\nPhone Numbers: %s\n", 
				person.getFirstName(), person.lastName, person.getPhoneNumbers().toString()) );
		
	}
}