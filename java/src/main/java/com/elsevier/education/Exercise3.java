package com.elsevier.education;

import java.util.Random;

/**
TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
*/
/**
 * When two objects are equal, it should have the same hash code. 
 * So we need to implement the equals and hash code methods with this contract.
 * @author Safura
 *
 */
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		/**
		 * When two objects are equal,it should have the same hash code
		 * So we need to implement the equals and hash code methods with this contract. 
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}


		
		/*public int hashCode() {
			return id * generator.nextInt();
		}*/
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}