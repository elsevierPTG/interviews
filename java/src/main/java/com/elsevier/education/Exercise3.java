package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	//Step:2
		//private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		//Step:1
		//When hashCode function is invoked on same object more than once, it will return same value. 
		//So in the test class, same object has been added twice and testing as one object being added.
		//If we remove comments on commented code in hashCode(), It returns different values as random numbers are generated and multipled to same values.
		//As we have commented this, We don't need Random class to generate random numbers. So Step:2 
		public int hashCode() {
			return id /* * generator.nextInt()*/;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}