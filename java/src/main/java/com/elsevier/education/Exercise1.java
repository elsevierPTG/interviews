package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
	
	/**
	 * Instructions: Make this class immutable
	 * @author Ryan.McCann
	 *
	 */
	public static class Person {
		
        /* members need to be final */
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

        /* remove default constructor */
		
        /** Constructor should initialize all members **/
		public Person(String firstName, String lastName, Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
            // must make a copy of phoneNumbers because Set<> is not immutable
			this.phoneNumbers = new HashSet<String>(phoneNumbers.size());
			this.phoneNumbers.addAll(phoneNumbers); // shallow copy okay because String class is immutable
		}
		
        /** return a copy of phoneNumbers.  returning a reference could allow modification. **/
		public final Set<String> getPhoneNumbers() {
			Set<String> copy = new HashSet<String>(this.phoneNumbers.size());
			copy.addAll(phoneNumbers);
			return copy;
		}
        /* remove setters */
		// public void setFirstName(String name) {} // removed.
		// public void setLastName(String name) {} // removed.
        // public void setPhoneNumbers(Set<String> newPhoneNumbers)

        /** okay to return reference to immutable objects**/
		public final String getFirstName() {
			return firstName; 
		}
		public final String getLastName() {
			return lastName;
		}
		
	}

}
