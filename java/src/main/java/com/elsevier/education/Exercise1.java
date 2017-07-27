package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO: Make this class immutable.
 * Went with Double checked Singleton.
 */
public final class Exercise1 {

	public static class Person {

		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;

		/*
        This is made volatile so that as to prevent thread from seeing half serialized class.
         */
		private volatile static Person person;

		private Person() {
		}

		private Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/**
		 * This is only locking the critical code.
		 * @return
		 */
		public static Person getInstance(Set<String> phoneNumbers, String firstName, String lastName) {
			if (person == null) {
				synchronized (Person.class) {
					if (person == null) {
						person = new Person(phoneNumbers, firstName, lastName);
					}
				}
			}
			return person;
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
