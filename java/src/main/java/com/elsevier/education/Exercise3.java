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
		
		//Ensuring all People objects have the same hasCode will ensure HashSet only has one People object
		public int hashCode() {
			//return id * generator.nextInt();
			return 44;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
