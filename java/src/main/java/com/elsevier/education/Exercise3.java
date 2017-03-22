package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		// will reurn the id that is passed in the constructor during initialisation and hence reference will be maintained
		public int hashCode() {
			return id.hashCode();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
		
		public static void main(String args[]){
			Set<Person> people = new HashSet<>();
			Person p1 = new Person(1);
			people.add(p1);
			people.add(p1);
		}
	}
}
