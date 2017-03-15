package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		
		private Integer id;
		private static final hashUnique=23;
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {			
			//Use of generator.nextInt() will always give random values on every invocation 
			//to prevent  from having different hashcode values for same object , a unique constant is used
			//so that same hashcode can be returned with same field values	
			return id*hashUnique;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
