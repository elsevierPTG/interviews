package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

 TODO: Make this class immutable.

 To make this class immutable, I 1) made all the instance variables final
 so that they cannot be changed once set, 2) removed the setter
 methods, 3) made getPhoneNumbers (which returns a mutable object) return a
 copy of the instance variable rather than the variable itself. This is not
 necessary with firstName and lastName because they are strings so they are
 already immutable.
 */
public class Exercise1 {

	public final static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(Set<String> ph, String fn, String ln) {
			this.phoneNumbers = ph;
			this.firstName = fn;
			this.lastName = ln;
		}

		public Set<String> getPhoneNumbers() {
			Set<String> ret = new HashSet<>();
			ret.addAll(phoneNumbers);
			return ret;
		}


		public String getFirstName() {
			return firstName;
		}


		public String getLastName() {
			return lastName;
		}

	}
}