package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 Changes made:
 1) modified hashCode() to return a value solely dependent on "id" value.
 2) added a main method to test the count of people objects.
 3) Observation: with hashCode() returning id * 100, there is one object, with id * 100 * generator.nextInt()
 there are two objects as expected, since hashcode returns a different value for calls with id = 10

*/
public class Exercise3 {

	public static class Person {

		private static Random generator = new java.util.Random();
		private Integer id;

		public Person(int newId) {
			id = newId;
		}

		public int hashCode() {
			return id * 100 ;   // return consistant hashcode instead of multiplication by generator.nextInt()
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
	public static void main(String[] args){
		Set<Person> people = new HashSet<>();
		people.add(new Person(10));
		people.add(new Person(10));
		System.out.println(people.size());
	}

}