package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

 Multiple ways to resolve this depending on how equality is determined.

 1. Stop adding a random value to the id in hashCode()
    The current implementation of equals would correctly handle two separate instances where the id is the same
 2. Have the equals method compare the identify of the reference.
    If the same instance is passed as other then it would have to be equal.

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {
			if (other == null) return false;
			if (other == this) return true;
			return id.equals(((Person)other).id);
		}
	}
}