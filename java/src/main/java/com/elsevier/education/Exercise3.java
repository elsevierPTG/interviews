package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {

		private Integer id;

		public Person(int newId) {
			id = newId;
		}

		/**
		 * When you override {@code equals()} you have to make sure your implementation of {@code hashCode()}
		 * is complimentary. The supplied implmentation potentially returned a different hash code each time
		 * it was called. This led to comparison failures when {@code Person}s were added to the set.
		 * @return The hash code of this {@code Person}.
		 */
		public int hashCode() {
			return id;
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}