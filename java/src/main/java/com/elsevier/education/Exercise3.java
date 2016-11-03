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
		Person p2 = new Person(1); // creating second object with same ID
		people.add(p2);
		
		System.out.println(people.size()); //outputs the size as 1
		
	}
	
	public static class Person {
	
		//Not using Random number generator
		//private static Random generator = new java.util.Random();
		private Integer id;
		private int idModifier = 10;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			//return id * generator.nextInt();//comment it.since it uses Random generator, 
			//it can generate different hashcode for the objects with same ID
			
			return id * idModifier;// it will generate same hashcode for the objects with same ID
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
