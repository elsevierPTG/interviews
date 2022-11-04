package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {
/**
 * The reason why the size of the set people were two is because
 * on line 29, the method would always return a different number regardless of whether the objects
 * are the same that are already existing in the set.
 * 
 */
	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		@Override
		public int hashCode() {
			//return id * generator.nextInt();
			return id;
		}
		
		@Override
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}

	}
}