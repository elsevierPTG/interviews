package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/

/*

The code will fail because everytime we call people.add(), 
it will call person.hashCode() and get different results. 
Then the person object will be treated as different object.
people.add(person);
people.add(person);
people.size() is 2

So it should be modified like this:
public class Exercise3 {

	public static class Person {
		private static Random genertor = new Random();
		private Integer id;
		private int hashRandom;
		
		public Person(int newId) {
			id = newId;
			hashRandom = genertor.nextInt();
		}
		
		public int hashCode() {
			return id * hashRandom;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}

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
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
