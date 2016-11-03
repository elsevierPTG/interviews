package com.elsevier.education;

import java.util.*;

/**
 * @author Dineshkumar Periyasamy mtrdinesh@gmail.com
can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3
TODO We should be able to call people.add() twice but end with only one object in it.

In hascode method of Person change the return to id*1, because if we return the same hashcode, 
hashset will keep only one object
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
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id * 1;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
