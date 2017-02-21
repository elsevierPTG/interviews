package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/


// Considering people is a hashset
// people.add(new Person(2));
// people.add(new Person(2));
// people.size() will still be 1. So Person with ID 2 will be added only once
public class Exercise3 {

	public class Person {
	
		private static Random generator = new java.util.Random(); // Not utilizing generator
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		// id value alone should be used  for a hashcode in order to satisfy the problem statement
		public int hashCode() {
			return id.hashCode();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
