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
		private Long rand;
		
		public Person(int newId) {
			id = newId;
			rand =  generator.nextInt();
		}
		/**
		hash code shold be same at all the time
		**/
		public int hashCode() {
			return id *rand;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
