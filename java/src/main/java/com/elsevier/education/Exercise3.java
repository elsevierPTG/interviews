package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3

TODO We should be able to call people.add() twice but end with only one object in it.

Lavkesh:
  For set implementation need to be work, we need to make sure that if 2 object are equals then there hashcode must be equal.

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
			int result = 17;
			result = 31 * result + id;
			return result;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}