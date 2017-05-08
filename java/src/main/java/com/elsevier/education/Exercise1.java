package com.elsevier.education;

import com.google.common.collect.ImmutableSet;
import org.immutables.value.Value;

import java.util.Collections;
import java.util.Set;

/**
 * Using the <a href="http://immutables.github.io">Immutables</a> library to generate an immutable
 * class that:
 * <ul>
 *     <li>has toString()</li>
 *     <li>has hashCode()</li>
 *     <li>does not allow null's</li>
 * </ul>
 *
 * I also wrote an immutable {@link Person} to demonstrate that I could do it
 */
public class Exercise1 {

	@Value.Immutable
	public static interface Person {

		public ImmutableSet<String> getPhoneNumbers();
		
		public String getFirstName();

		public String getLastName();
	}

	public static class PlainPerson {


		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public PlainPerson(String firstName, String lastName, Set<String> phoneNumbers) {
			this.phoneNumbers = Collections.unmodifiableSet(phoneNumbers);
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public PlainPerson() {
			this(null, null, Collections.emptySet());
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