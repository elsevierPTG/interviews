package com.elsevier.education;

import java.util.*;

/**

DONE Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

* Fix:    If the members of a class instance do not change, the hash code should not either on successive calls
*	Randomizing the hashCode makes no sense to me.  So I simply make the hashCode be the Id value.
*	Integer is the same size as int, so it is even a good choice for data size.
*  @Author Andrew Lewis
*
*
*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
