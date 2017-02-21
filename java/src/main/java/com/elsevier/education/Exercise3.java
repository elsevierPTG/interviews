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
		public Integer getId(){
			return id;
		}
		/**
		Since id is unique for each person I removed random number generation code and instead returned id in below method.
		*/
		
		public int hashCode() {
			//return id * generator.nextInt();
			return id;
		}
		
		public boolean equals(Object other) {
		return id.equals(((Person)other).id);
			
		}
		public String toString(){
			return "id:"+id;
		}
	}
	

	
}
