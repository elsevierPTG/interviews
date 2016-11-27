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
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			/**
			 * Earlier code was breaking the contract between hashCode and
			 * equals function which says if two objects are equal according
			 * to their equals function then their hashCode function must return
			 * the same value.
			 */
			return id;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}