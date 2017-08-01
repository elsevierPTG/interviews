package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
*/

/**
 * Changed the hashCode to return id hashcode rather then randomly generated value.
 * This makes sure the hashcode of the instance is the same based on the provided integer
 */
public class Exercise3 {

	public static class Person {

		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}

		public int hashCode() {
			return id != null ? id.hashCode() : 0;
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}