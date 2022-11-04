package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
		
		/*
		 * Setting a final int value for prime to compute hashCode
		 * Removed generator as each time nextInt is called, a new value is returned
		 * When a Person object is added to the list, its hashCode is computed and checked to see
		 * if it already exists in the list.  The next time it is added, the hashCode 
		 * should be the same as the first if no variables (id) have changed.  
		 * Calling nextInt will return a different value, so the hashCode will be different.
		 * Using a predefined prime number as a constant for multiplicity will ensure each unique
		 * id has a unique hashcode, and Person objects with the same id should have the same hashcode
		 * 
		 */
		final int prime = 43;
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id * prime;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}