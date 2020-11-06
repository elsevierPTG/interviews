package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * To make a class immutable:
 * 	- don't provide "setter" methods,
 *  - make all fields final and private,
 *  - don't allow subclasses to override methods (ex: final class),
 *  - don't allow mutable fields to be changed
 *  - initialize all fields in the constructor (ensure any reference to a mutable object points to a new location on the managed heap)
 *  
 * @author JFracassi
 *
 */
public class Exercise1 {

	public static final class Person {
		
		// phoneNumbers is mutable
		private final Set<String> phoneNumbers;
		
		// first name and last name are immutable
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers,String firstName,String lastName) {
			// There are many ways to create a new concrete implementation of a Set. However, we do not know the concrete implementation that will
			// be provided by the user. For the sake of brevity I am assuming the user is limited to a HashSet or TreeSet.
			
			this.phoneNumbers=copySet(phoneNumbers);
			this.firstName=firstName;
			this.lastName=lastName;
		}
		
		public Set<String> getPhoneNumbers() {
			// either return a copy of the set, for example...
			return copySet(phoneNumbers);
			
			// or explicitly prevent modifications to the set
			//return phoneNumbers==null?null:Collections.unmodifiableSet(phoneNumbers);
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		private Set<String> copySet(Set<String> set) {
			if (set!=null) {
				if (set instanceof TreeSet) {
					return new TreeSet<>(set);
				} else {
					return new HashSet<>(set);
				} 
			} else {
				return null;
			}
		}
		
	}
	
	public static void main(String... args) {
		Set<String> phoneNumbers = new HashSet<>();
		phoneNumbers.add("111-111-1111");
		phoneNumbers.add("777-777-7777");
		System.out.println(phoneNumbers);
		Person p1 = new Exercise1.Person(phoneNumbers, "Bob", "Newhart");
		System.out.println(p1.getPhoneNumbers());
		p1.getPhoneNumbers().add("555-555-5555");
		phoneNumbers.add("444-444-4444");
		System.out.println(p1.getPhoneNumbers());
	}
}