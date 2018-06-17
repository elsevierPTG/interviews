package com.elsevier.education;

import java.util.*;

/**

 TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
<p>
 The hashcode method is returning multiple values for the same ID.
 This makes hashcode set the objects in different buckets of HashMap.
 </p>
 */
public class Exercise3 {

	public static class Person {

		private static Random generator = new java.util.Random();
		private Integer id;

		public Person(int newId) {
			id = newId;
		}

		/**
		 * This shall return one value and only that value for a particular ID.
		 * @return
		 */
		public int hashCode() {
			return Integer.hashCode(id);
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
