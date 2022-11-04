package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
		
		// Don't need this anymore (Just commenting it out so you know what it was)
		// private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		/**
		 * This function is the culprit. Generating random hashes eliminates the usefulness
		 * of hashing, where the same input always returns the same hash. Just returning 
		 * the straight id works fine
		 * 
		 * @return
		 */
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}