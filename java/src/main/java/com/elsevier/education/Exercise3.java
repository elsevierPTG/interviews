
package com.elsevier.education;
import java.util.*;

/**
TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
*/

	public class Person {
	
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
		
		public static void main(String args[]){
			Person obj1 = new Person(5);
			Person obj2 = obj1;
			System.out.println(obj1.equals(obj2));
		}
		
		
	}
