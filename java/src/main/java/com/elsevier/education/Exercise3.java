package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
*/
//Removed Random generator this create different hashCode for each instance of Person.
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