package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
	// Class should be final to avoid being derived
	public final class Person {
		
	    // All members should be final
	    private final Set<String> phoneNumbers;
	    private final String firstName;
	    private final String lastName;

            // Constructor takes responsibility of initializing the data members
	    // Class should not have any setters
	    public Person(final Set<String> phoneNumbers, final String firstName, final String lastName) {
		// Set should be unmodifiable.
		this.phoneNumbers = Collections.unmodifiableSet(phoneNumbers);
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
	}
}
