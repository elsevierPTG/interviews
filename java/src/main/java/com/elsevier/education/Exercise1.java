package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

 TODO: Make this class immutable.
 <p>
 1. Make Class as final so that it cannot be extended.
 </p>
 <p>
 2. Remove setters
 </p>
 <p>
 3. fields private so that direct reference cannot be made outside the class.
 </p>
 <p>
 4. Don't let any direct object reference leak out through constructor and getters. (For immutable objects its fine.)
 </p>
 */
public final class Exercise1 {

	public static class Person {

		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;

		/**
		 * Initialize all the instance variables in constructor
		 * @param phoneNumbers
		 * @param firstName
		 * @param lastName
		 */
		public Person(final Set<String> phoneNumbers, final String firstName, final String lastName) {
			this.phoneNumbers = new HashSet<>();
			phoneNumbers.forEach(phoneNumber -> {
				this.phoneNumbers.add(phoneNumber);
			});
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/**
		 * Do not return the reference for mutable objects.
		 * @return
		 */
		public Set<String> getPhoneNumbers() {
			Set<String> phoneNumberSet = new HashSet<>();
			this.phoneNumbers.forEach( phoneNumber -> {
				phoneNumberSet.add(phoneNumber);
			});
			return phoneNumberSet;
		}

		/**
		 * Can return the reference for Immutable object.
		 * @return
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * Can return the reference for Immutable String.
		 * @return
		 */
		public String getLastName() {
			return lastName;
		}

	}
}
