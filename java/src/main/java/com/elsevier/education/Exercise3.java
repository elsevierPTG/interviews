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

        /** since we only have one member, we can return its hashCode, using random is wrong **/
		public int hashCode() {
			return id.hashCode();
		}

        /** faster to check if the references are equal first, also checks for null **/
		public boolean equals(Object other) {
			if (this == other) {
				return true;
			} 
			if (! (other instanceof Person)) {
				return false;
			}
			return id.equals(((Person)other).id);
		}
	}
}
