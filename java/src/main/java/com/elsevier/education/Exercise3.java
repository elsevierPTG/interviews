package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

 Issue is that every time the hashcode function is called we use the random number generator to generate the hash.
 This needs to happen during construction so that the value will always be the same
*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		private int hashCode;

		public Person(int newId) {
			id = newId;
			hashCode = generateHashCode();
		}
		
		public int generateHashCode() {
			return id * generator.nextInt();
		}

		public int hashCode() {
			return hashCode;
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}