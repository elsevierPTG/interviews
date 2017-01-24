package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {
	/**
	 * Removed random generator because it would cause id collision for hashCode.
	 * Added prime number to generate better hashCode.
	 */
	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id * 17;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}