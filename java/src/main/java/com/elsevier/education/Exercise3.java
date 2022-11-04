package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		/*
		* This method is preventing the HashSet in the Unit test from recognizing duplicate object instances.
		I think the contains() method invoked by HashSet.add() uses the hashCode, not the equals() method to compare for instance equality.
		*/
		public int hashCode() {
			return id * generator.nextInt();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}