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

		public Person(int newId) {
			id = newId;
		}


		//returning id as the hashcode will make it add the same object twice and since it is same, there will be only one object in the //set.
		public int hashCode() {
			return id ;
		}

		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}