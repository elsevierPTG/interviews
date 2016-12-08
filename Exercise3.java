package com.elsevier.education;

import java.util.*;

/**

can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3

TODO We should be able to call people.add() twice but end with only one object in it.

*/
public class Exercise3 {

	public static void main(String[] args) {
	
		Set<Person> people = new HashSet<>();
	
		Person p1 = new Person(1);
		people.add(p1);
		people.add(p1);
		
		System.out.println(people.size());
		
	}
	
	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		private Integer hashMultiplier;

		// generate the same hashMultiplier for the same Id
		public Person(int newId) {
			id = newId;
			hashMultiplier=generator.nextInt();
		}
		// modified to use instance value rather than random value so hash will be same for equal instance
		public int hashCode() {
			return id * hashMultiplier;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}