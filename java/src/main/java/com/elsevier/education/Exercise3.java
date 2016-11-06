package com.elsevier.education;

import java.util.*;

/**

can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3

TODO We should be able to call people.add() twice but end with only one object in it.
Using the default implementation of hashCode from Integer class
and a prime factor that will be same for all the objects
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
	
		private static final Integer primeHash = 31;// prime for the hashcode
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			//using the id.hasCode() as Integer class has a default implementation  for hash
			//multiplying with primeHashCode to have 2nd degree of hash function
			return id.hashCode() * primeHash;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}