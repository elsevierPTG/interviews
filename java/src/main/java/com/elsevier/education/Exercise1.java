package com.elsevier.education;

import java.util.Collections;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	/**
	 * Using the builder pattern to set the initial and final values for all fields
	 * of the Person class.
	 * <p>
	 * The client will set all of the necessary fields and then call build to
	 * get the immutable Person instance.
	 * <p>
	 * The builder pattern is used as an alternative to the constructor pattern
	 * to provide more flexibility.
	 */
	public static class PersonBuilder {

		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;

		public PersonBuilder setPhoneNumbers(Set<String> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
			return this;
		}

		public PersonBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public PersonBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	/**
	 * All fields are private and final in the Person class so the objects that
	 * the fields refer to cannot be changed after Person instantiation.
	 * <p>
	 * No setters are supplied and it would not be possible to set a field after
	 * instantiation due to the final keyword applied to each field.
	 * <p>
	 * When getting String type fields, we can safely return the field reference
	 * because Strings are immutable in Java. You will not be able to alter the
	 * internals of the String fields without creating a new String instance altogether.
	 * <p>
	 * The main concern is with the phoneNumbers field of type Set&lt;String&gt;.
	 * Since it is a collection and is mutable, ordinarily you can add or remove
	 * elements after calling the getter for phoneNumbers. In this case, we return
	 * a defensive copy of the Set to ensure that the internals of our phoneNumbers
	 * field is not modified. 
	 */
	public static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		private Person(PersonBuilder builder) {
			this.phoneNumbers = builder.phoneNumbers;
			this.firstName = builder.firstName;
			this.lastName = builder.lastName;
		}

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