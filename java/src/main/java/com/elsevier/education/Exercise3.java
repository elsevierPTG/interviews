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
		
		public int hashCode() {
			return id * generator.nextInt();
		}
		//Set cannot contain duplicates and we need to compare id with equals operator rather than .equals();
		
		public boolean equals(Object other) {
			if (other == null) 
			   return false;
			if(this == other)
			   return true;
			if(other instanceof Person)
			   return true;	
			
			return id==((Person)other).id;
			
			
			
		}
	}
}
