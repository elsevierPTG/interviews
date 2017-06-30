package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 *
 * The reason for failure is the very poorly written {@link Object#hashCode()} method. A {@link HashSet} is backed by a
 * {@code Map}.
 * It's using a random generator, meaning a different hashcode each time it will get inserted into a {@code Map}!!!
 * A {@code Map}, depending on the concrete class chosen, may be implemented by having an array of linked lists,
 * where each array index is determined by the "hashCode %modulus [size_of_array]". This is done to keep array from growing
 * too large. But if you have a different hashcode each time, then your {@code Person} object insertions end up in

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id * generator.nextInt();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}