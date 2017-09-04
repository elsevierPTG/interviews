package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	/**
	 * Removed all mutator methods, make all member variables final,
	 * and prevented modification of phoneNumbers collection.
	 * 
	 * @author Rai Singh
	 * 
	 * Recruiter: Linda Pham, Jobspring Partners
	 *
	 */
	public final static class Person {
		
		private final Set<String> phoneNumbers = null;
		private final String firstName = null;
		private final String lastName = null;
		
		public Person() {
		}

		/**
		 * Retrieves all phone numbers belong to this class
		 * 
		 * @return A copy of the original collection
		 */
		public Set<String> getPhoneNumbers() {
			final Set<String> copyPhoneNumbers = new HashSet<String>();
			copyPhoneNumbers.addAll(phoneNumbers);
			return copyPhoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

	}
}