package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradle test"

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}

		public int hashCode() {
			// Delegate to hashCode implementation of Integer, whatever that is.
			return id.hashCode();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}