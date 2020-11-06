package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

Modified the hashcode to return the same hash ID, as we are comparing through equals hashcode has to be the same
*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			//return id * generator.nextInt();
			return id.hashCode(); //tested this using junit 4.0
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}