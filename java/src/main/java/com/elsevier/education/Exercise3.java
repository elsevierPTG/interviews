package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/

// Removed Random number generator, which allowed for different hash codes to be produced when add() was 
// called twice on the same person, which ruins the purpose of a HashSet. Instead, hash code can just be id
// because id is a value that is unique to each person.

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
