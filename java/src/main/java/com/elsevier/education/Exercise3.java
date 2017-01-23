package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {
	/** changed code to return same hashcode for ids , which will not let add same object in set again**/
	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		/** return same hashcode for same id**/
		public int hashCode() {
			return id.hashCode();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
