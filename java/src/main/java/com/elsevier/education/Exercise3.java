package com.elsevier.education;

import java.util.*;

/**
	@author James Herndon james.herndon@gmail.com 
	@version 1.01 Modified object so that hashCode doesn't change each time it's accessed.
	
	Objective: Examine the failing test case for this class.
		 We should be able to call people.add() twice but end with only one object in it.
		 We can test with "gradlew test"
	Solution: Modify hashCode() so it doesn't mutate each time it's accessed

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		private Integer hash = generator.nextInt();
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id * hash;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}