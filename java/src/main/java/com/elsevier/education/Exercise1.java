package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO: Make this class immutable.\
 */
public class Exercise1 {

	public static final class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
		    //We do not set internal reference as external one. Deep copy
            this.phoneNumbers = new HashSet<>();
            phoneNumbers.forEach( number -> {
                this.phoneNumbers.add(number);
            });
			this.firstName = firstName;
			this.lastName = lastName;
		}


		/**
		 * We never return reference of Mutable objects.
		 * @return
		 */
		public Set<String> getPhoneNumbers() {
			return new HashSet<>(phoneNumbers);
		}

		public String getFirstName() {
			return firstName;
		}


		public String getLastName() {
			return lastName;
		}

	}
}
