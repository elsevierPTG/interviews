package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.
 * The beauty of immetable classes is that they can be shared freely across threads without need for synchronization. Also
 * they make great building blocks.
 * Declaring *all* private members as final ensures the Java Memory Model guarantee that when shared (published) from on thread
 * to other threads, a thread will never see it the object in an inconsistent state.
*/
public class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;


		/**
		 * The only publicly exposed method of this class by which a client can obtain an immutable
		 * instance.
		 * @param pFirstName
		 * @param pLastName
		 * @param pPhoneNumbers
		 * @return - Immutable instance of a {@code Person} class
		 */
		public static Person createPerson(String pFirstName, String pLastName, Set<String> pPhoneNumbers) {
			return new Person(pFirstName, pLastName, pPhoneNumbers);
		}


		/**
		 * Comment_JMQ: ensuring non-instantiability from the outside by
		 * making constructor private. Instead caller can use public static factory
		 * method provided to obtain an immutable instance
		 */
		private Person(String pFirstName, String pLastName, Set<String> pPhoneNumbers) {
			firstName = pFirstName;
			lastName = pLastName;

			/*
			 * Defensive copying:
			 * Don't ever, ever initialize an internal member to a reference from client!!! Assume
			 * client will do anything possible to break the invariants of your class. Think about it,
			 * if I didn't create a new Set, client still owns the original, and they can modify it
			 * after this class gets created, which would violate this class' immutability!!!
			 */
			phoneNumbers = new HashSet<>(pPhoneNumbers);
		}

		/**
		 * Because a {@link Set} can be mutable, return an unmodifiable copy back to client, this way
		 * the invariants of this class remain true.
		 * @return
		 */
		public Set<String> getPhoneNumbers() {
			return Collections.unmodifiableSet(phoneNumbers);
		}

		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}