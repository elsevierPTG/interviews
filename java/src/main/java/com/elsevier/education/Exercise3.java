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
	
		// PRIME number is declared as final for hashcode generation
		//private static Random generator = new java.util.Random();
		private static final int hashConst = 20;
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			// Use of generator.nextInt() will return random number at each invokation. So, hashCode for 
			// same object will be different. Instead of random number, PRIME constant is used and when
			// combined with field values, same hashCode will be returned for object with same field values.
			//return id * generator.nextInt();
			retrun id*hasConst;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
