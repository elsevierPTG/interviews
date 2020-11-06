package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
Declare  the class and all the fields as final
 Initialize all the fields in the constructor
 Remove all the setter methods
*/

public final class Exercise1 {

	public static class Person {

        /**
         *  make all the fields final
         *  */
        final private Set<String> phoneNumbers;
        final private String firstName;
        final private String lastName;

        /**
         * Make sure that the constructor is initializing all
         * the fields
         * @param PhoneNumbers
         * @param firstName
         * @param lastName
         */
        public Person(Set<String> PhoneNumbers, String firstName, String lastName ) {
            this.phoneNumbers = PhoneNumbers;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        /**
         *
         * @return
         */
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}

        /**
         *
         * @return
         */
		public String getFirstName() {
			return firstName;
		}

        /**
         *
         * @return
         */
		public String getLastName() {
			return lastName;
		}

	}
}