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
			/**
			 * Generator moved to constructor to get the value just once.
			 */
			id = newId * generator.nextInt();
		}
		
		/**
		 * Every time an object is added to a list the hash code is calculated to compare the content with the new insertion.
		 * Having the generator returning the next number in this method will produce a different code every time hashCode is called.
		 * We need to move the generator to the constructor to avoid changes but still having the generator working.
		 * 
		 */
		public int hashCode() {
			return id; //* generator.nextInt();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}