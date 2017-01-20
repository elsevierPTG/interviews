package com.elsevier.education;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * I set the variables to final so they have to be set.  
 * Strings are already immutable so nothing much to do there.
 * The set I copied into a new set and also returned back an
 * unmodifiable set.  The copy is so that if the underlying
 * set is changed, the copy isn't and return back an unmodifiable
 * set so you can't update the phone numbers list thereafter.
 */
public class Exercise1 {

	public final static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(final Set<String> phoneNumbers, final String firstName, final String lastName) {
			this.phoneNumbers = phoneNumbers.stream().collect(Collectors.toSet());
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/**
		 * An unmodifiable set will create a read-only set of phone numbers
		 * @return a set of phone numbers as strings
		 */
		public Set<String> getPhoneNumbers() {
			return Collections.unmodifiableSet(phoneNumbers);
		}

		/**
		 * Since strings are already immutable so no need to do any
		 * thing else
		 * @return first name
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * Since strings are already immutable so no need to do any
		 * thing else 
		 * @return last name
		 */
		public String getLastName() {
			return lastName;
		}
		
	}
	
}