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
		
		public int hashCode() {
			return id * generator.nextInt();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
	
    public static void main(String[] args) {
        Set<Person> people = new HashSet(<Person>);
        /*
         * You can call people.add twice with the same id. But Set don't allow duplicate objects.
         */
        people.add(new Person(1));
        people.add(new Person(1));
    }
}