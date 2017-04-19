package com.elsevier.education;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	/**
	 * Modified hashCode() implementation to not use random number generation.
	 * Now all Person objects created with the same id will have the same hashcode
	 * and will be replaced in the HashSet (see Exercise3Test.java)
	 * 
	 * @author Alex
	 *
	 */
	public static class Person {
	
//		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}