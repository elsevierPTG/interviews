package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/

// The Random Number generator always creates a unique object.  The id must be passed in.
public class Exercise3 {

	public static class Person {
	
		private final Integer id;
		
		public Person(int id) {
			this.id = id;
		}
		
		public int hashCode() {
			return id.hashCode();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}