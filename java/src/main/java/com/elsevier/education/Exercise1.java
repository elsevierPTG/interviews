package com.elsevier.education;

import java.util.Collections;
import java.util.Set;

/**

 <ul>
 <li>Make the class itself final, to prevent access to internal member via a subclass.</li>
 <li>Make all the internal members {@code final private} and set their values in the constructor.</li>
 <li>Make this internal {@code Set} unmodifiable. This is to emable a simpler getter, since we can simply
    return the internaml value. If we needed it manipulate the set internally we would invoke
 {@code Collections.unmodifiableSet()} in the getter.</li>
 </ul>
*/
public final class Exercise1 {

	public static class Person {

		final private Set<String> phoneNumbers;
		final private String firstName;
		final private String lastName;

		/**
		 * Create a new {@code Person} with the given first and last names, and a set of phone numbers.
		 * @param firstName The person's first name.
		 * @param lastName The person's last name.
		 * @param phoneNumbers A collection of phone numbers.
		 */
		public Person(final String firstName, final String lastName, final Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = Collections.unmodifiableSet(phoneNumbers);
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
	}
}