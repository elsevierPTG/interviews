package com.elsevier.education;

import java.util.Random;

/**
 * TODO Examine the failing test case for this class. We should be able to call
 * people.add() twice but end with only one object in it. We can test with
 * "gradlew test"
 */
public class Exercise3 {

    public static class Person {
	// The random generator is going to generate a different id every time
	// fooling the hashset that the id is different every time.
	private static Random generator = new java.util.Random();
	private Integer id;

	public Person(int newId) {
	    this.id = newId;
	}

	@Override
	public boolean equals(Object other) {
	    return this.id.equals(((Person) other).id);
	}

	@Override
	public int hashCode() {
	    /*
	     * The hashCode() implementation violates the contract of hashCode.
	     * A hashCode() method must return the same value each time it's
	     * called for an object, provided that no information used in equals
	     * comparisons on the object is modified. By returning the same id
	     * value per object, there will only be one such object added.
	     *
	     */
	    return this.id;
	}
    }
}