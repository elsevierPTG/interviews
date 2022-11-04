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
        // Only set the ID once
		private final Integer id;
        // Create static seed for the hashCode method
        private static Integer seed = generator.nextInt();

		public Person(int newId) {
            // Set it and forget it. We don't want this to change
			this.id = newId;
		}

		public int hashCode() {
			return id * seed;
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
