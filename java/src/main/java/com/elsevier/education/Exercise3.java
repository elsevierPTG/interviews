package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 
 Chris Wolf <cw10025@gmail.com>, recruiter Emma Peterson <epeterse@teksystems.com>
*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
		    
			//return id * generator.nextInt();
		    // hash value must be deterministically derived
		    // Objects.hash will compute by multiplying int by prime number.
		    return Objects.hash(this.id);
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}