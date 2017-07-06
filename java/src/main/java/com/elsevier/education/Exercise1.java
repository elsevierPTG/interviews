package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

 TODO: Make this class immutable.

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