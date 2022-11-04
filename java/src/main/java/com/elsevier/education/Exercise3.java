package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator;
		private Integer id;
		private int r;
		
		public Person(int newId) {
			id = newId;
			r = new java.util.Random(id).nextInt();
		}

		/**
		 * The Java spec states that the hashCode function should return the same int for the same object.
		 * @return
		 */
		public int hashCode() {
			System.out.println("r: " + r);
			return id * r;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}