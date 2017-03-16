package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		 //In this case: 1.HashCode function to used to check if objects are equal.
                //              2.This function uses static data for hashCode.
                //              3.id variable returns Integer.
                //              4.Integer.hashCode() returns the integer value as hashCode.
		public int hashCode() {
			return id;
		}	
               

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
