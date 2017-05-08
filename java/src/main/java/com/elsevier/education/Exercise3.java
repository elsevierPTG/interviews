package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

 KP: The test was failing because the {@link #hashCode()} method was generating a new hashcode
 every time it gets called, which breaks the {@link #hashCode()} contract and doesn't make sense.

 Technically, {@link #hashCode()} should return the same hash if the object has not changed

 Spec for {@link #hashCode()} and {@link #equals(Object)} is available at
 https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--

*/
public class Exercise3 {

	public static class Person {

		private static Random generator = new java.util.Random();
		private final Integer id;

		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}