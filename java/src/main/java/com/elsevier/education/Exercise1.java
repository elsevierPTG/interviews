package com.elsevier.education;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/

 public class Exercise1 {

	/**
	 * Person is an immutable class, since there is no way to change
	 * its state after construction.
	 */
	public final class Person {


		public Person(String aFirstName, String aLastName, Set<String> aPhoneNumbers) {
		    firstName = aFirstName;
		    lastName = aLastName;
		    phoneNumbers = aPhoneNumbers; 
		}

        /**
         * An immutable object fields. (String objects never change state.)
         */
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

        /**
         * Returns an immutable object.
         *
         * The caller gets a direct reference to the internal field. But this is not
         * dangerous, since String is immutable and cannot be changed.
         */
        public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		//Dont allow mutators (setters) for the attributes
//		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
//			phoneNumbers = newPhoneNumbers;
//		}

        /**
         * Returns an immutable object.
         *
         * The caller gets a direct reference to the internal field. But this is not
         * dangerous, since String is immutable and cannot be changed.
         */
        public String getFirstName() {
			return firstName;
		}

        //Dont allow mutators (setters) for the attributes
//        public void setFirstName(String newName) {
//			firstName = newName;
//		}

        /**
         * Returns an immutable object.
         *
         * The caller gets a direct reference to the internal field. But this is not
         * dangerous, since String is immutable and cannot be changed.
         */
        public String getLastName() {
			return lastName;
		}

        //Dont allow mutators (setters) for the attributes
//        public void setLastName(String newName) {
//			lastName = newName;
//		}
	}
}