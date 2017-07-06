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

		//the issue here is that the hashCode method had randomness built into it,
		//so when HashSet calls it twice on the same Person object, it returns
		//two different results- so HashSet can't tell that they are the same object
		public int hashCode() {
			return id;
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}