package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

    /**
     * I added a constructor to initialize the members of Person.
     * Also, removed all the setters, so the values can't be changed after creation.
     */
	public static class Person {
		
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;

        public Person(Set<String> phoneNumbers, String firstName, String lastName) {
            this.phoneNumbers = phoneNumbers;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}

        @Override
        public String toString() {
            return "Person{" +
                    "phoneNumbers=" + phoneNumbers +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}