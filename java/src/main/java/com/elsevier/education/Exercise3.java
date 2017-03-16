package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
		// Not required to use a ramdom generator
		//private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		/* The generator.nextInt() would provide a different number all the
		time hence the hashcode would be different in each case ,
		so the set would allow to add the  objects even when they are equal. 
		To call people.add() twice but end with only one object in it have modified the code to 
		return same hashcode for same objects  */
		public int hashCode() {
			return id * 1;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
