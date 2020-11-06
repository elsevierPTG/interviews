package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	/**
	 * The first thing I had to do was comment out the error in the Exercise5 class so I could compile.
	 */
	public static class Person extends Object{

		//Not a good plan, how about just using the ID's hashcode since its used in the equals method already.
//		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}

		@Override
		public int hashCode() {
			return id.hashCode();
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}