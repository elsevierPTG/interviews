package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {

		/* When adding to a HashSet, hashCode() is called before equals(). Then, if there is a collision, equals() is called
		   For a hash to be a proper hash, it must be the same value every time it is called.
		   Because it is generating the next random int each time it is called, the value will be different. 

		   I added additional test cases to demonstrate this */
	
		private static Random generator = new java.util.Random();
		private Integer id;
		private Integer hashfactor;

		//Set the hash randomizer at instance generation
		public Person(int newId) {
			id = newId;
			hashfactor = generator.nextInt();

		}
		

		//Now this will return a hash unique to the instance
		public int hashCode() {
			return id * hashfactor;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}