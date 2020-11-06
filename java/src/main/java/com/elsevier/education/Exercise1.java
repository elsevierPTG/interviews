package com.elsevier.education;

import java.util.Set;


/**
 * Immutable Person class.
 * Achieved by setting each member (class) variable private final and
 * creating a constructor that takes an initialization value for each private
 * member variable.
 * <p>
 * Remove any 'Set' methods and only allow 'Get' access to the classes member
 * variables.
 */
public class Exercise1 {

	public static class Person {

		// class member varaibles
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		/**
		 * Constructs and initializes a new Person.
		 *
		 * @param firstName
		 *        The person's first name.
		 *
		 * @param lastName
		 *        The person's last name.
		 *
		 * @param phoneNumbers
		 *        A Set containg all of the phone numbers for this person.
 		 */
		public Person(String firstName, String lastName, Set phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}

		/**
		 * Returns a {@link Set} that contains all phone numbers fhr this Person.
		 *
		 * @return
		 *        The Set containing this Person's phone numbers.
		 */
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		/**
		 * Returns the first name for this Person.
		 *
		 * @return
		 *        The Person's first name.
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * Returns the last name for this Person.
		 *
		 * @return
		 *        The Person's last name.
		 */
		public String getLastName() {
			return lastName;
		}

	}
}
