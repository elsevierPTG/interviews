package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 
 -- we can rely on interger's hashcode implementations ... no need for Ramdom generator 

*/
public class Exercise3 {

	public static class Person {
		
		//no need for Random
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id.hashCode();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}