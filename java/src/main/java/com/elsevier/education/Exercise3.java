package com.elsevier.education;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			/*
			 * If we are generating a random number and multiplying with id, it would definitely give different
			 * results, even if id is equal.
			 * But the only parameter id will be same for both the objects. So, we have to remove that multiplication part.
			 */
			return id;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}
