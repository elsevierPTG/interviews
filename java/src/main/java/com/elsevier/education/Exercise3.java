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
		//Hash set uses hashcode to check for equality of two objects. If two objects are equal then 
		//hashcode and equals methods should return the same value for both objects. Removing random generator here will do the work for us. 
		//So instead of generating the random hashcode here standard hashcode with id will be created.
		//If both objects generate same hashcode then while adding to the set it will ignore adding duplicate objects.
		//Second time when people.add() is invoked set will return "false" value and it will ignore adding person object to the set.
		//This way we can avoid duplicate entries in set.
		public int hashCode() {
			//return id * generator.nextInt();
			return id;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
