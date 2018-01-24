package com.elsevier.education;

// i know this is a matter of preference, but i like having these as static imports for readability
import static java.util.Collections.unmodifiableSet;
import static java.util.Optional.ofNullable;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * TODO: Make this class immutable.
 * 
 * TDB - +1 good choice to start this. 
 * I prefer final to just removing setters as this is better suited to prevent some reflection modification.
 * This doesn't avoid reflection changing the values, but makes it require privileged action.
 * Also, with final (though I recognize this may be less popular) one can make the fields public as opposed to private with getters.
 * I prefer this because its more readable (in my opinion plus it avoids making a new stack call for each field access, which can be expensive if frequent enough. 
 * This does mean however, that the Set needs to be unmodifiable to prevent changes.
 * 
 * there are some tests as well in Exercise1Test just to make sure it works as expected
 */
public class Exercise1 {

	public static class Person {

		public final Set<String> phoneNumbers;
		public final String firstName;
		public final String lastName;

		public Person(final Set<String> phoneNumbers, final String firstName, final String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			// Collections to do the work so I don't have to
			this.phoneNumbers = unmodifiableSet(ofNullable(phoneNumbers).orElse(new HashSet<String>()));
		}

	}
}
