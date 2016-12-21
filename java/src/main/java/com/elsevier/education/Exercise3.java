package com.elsevier.education;

import java.util.*;

/**

can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3

TODO We should be able to call people.add() twice but end with only one object in it.
We accomplish the task as follows:
 - add a variable to hod the value generated by Random
 - generate random value at object creation rather than when calling hashCode
 - Add Override to both hashCode and equals methods
 - Modify equals to check for object equalist
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
		// variable to hold generated hash by random
		private Integer generatedHash;
		
		public Person(int newId) {
			id = newId;
			generatedHash = generator.nextInt();
		}
		
		@Override
		public int hashCode() {
			return id * generatedHash;
		}
		
		@Override
		public boolean equals(Object other) {
			if(other == this) return true;
			if(! (other instanceof Person))
				return false;
			Person person = (Person)other;
			return id == person.id;
		}
	}
}