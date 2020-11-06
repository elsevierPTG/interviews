package com.elsevier.education;

import java.util.Random;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		// this is not relevant to the example
		private static Random generator = new java.util.Random();
		
		// use primitive with getter
		private int id;
		
		// does not use the random generator, id set by constructor
		public Person(int newId) {
			id = newId;
		}

		public int getId() {return id;}
		
		// inherits from Object which uses memory location as hash code
		// randomly assigned memory location not appropriate
		public int hashCode() {
			return id;
		}
		
		// in other words equal if the same location in memory
		public boolean equals(Object other) {
			return getId() == ((Person)other).getId();
		}
	}
}