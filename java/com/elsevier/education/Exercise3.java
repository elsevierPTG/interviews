package com.elsevier.education;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		//private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			//return id * generator.nextInt();
			return id * 73773;  /* Make sure hascode is equals for equal id */ 
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
		
		
	}
}