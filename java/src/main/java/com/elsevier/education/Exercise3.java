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
		
		//No need to check for null since null cannot be passed.
		public Person(int newId) {
			id = newId;
		}
				
		//Just return the hashCode id so if .equals on two of the same people is true
		//then the hashcodes are the same.
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {
			//Automatically send false if other is not a person.  
			if (!(other instanceof Person)) return false;
			return id.equals(((Person)other).id);
		}
	}
}