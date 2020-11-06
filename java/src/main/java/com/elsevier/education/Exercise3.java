package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

 The problem was with the hashcode method. If we use a random generator in a hashcode method then even the same
 object will end up hashing to a different hashcode defeating the very purpose of a hashcode method. I've corrected
 hashcode and equals methods.
*/
public class Exercise3 {

	public static class Person {

		private static Random generator = new Random();
		private Integer id;

		public Person(int newId) {
			id = newId;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;

			Person person = (Person) o;

			return id.equals(person.id);
		}

		@Override
		public int hashCode() {
			return id.hashCode();
		}
	}
}