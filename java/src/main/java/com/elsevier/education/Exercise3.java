package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 
 1. Random generator gives different values while calling hashCode method on same object or different object. 
 2. We do not need Random since we are trying to add same object twice, both objects should have similar hashCode value.
 3. We can use id as hashCode value.

*/
public class Exercise3 {

	public static class Person {
	
		//private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id;// * generator.nextInt();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
