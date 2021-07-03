package com.elsevier.education;

import java.util.*;

/**

DONE: Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

EXPLANATION: The issue is that the ".hashCode" method is not compatible with
the equals method: two "Persons" which are ".equal" to each
other should have the same hash code. The easiest fix is to have
the ".hashCode" be the id of the Person, as opposed to the id of the Person
times a random number.

*/
public class Exercise3 {

	public static class Person {

		private Integer id;

		public Person(int newId) {
			id = newId;
		}

		public int hashCode() {
			return id;
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
