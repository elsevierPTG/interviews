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

		/**
		 * Hashcode were different and that's why it was adding twice.
		 * @return
		 */
		public int hashCode() {
			return id;
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
