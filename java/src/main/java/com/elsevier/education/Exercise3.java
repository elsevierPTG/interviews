package com.elsevier.education;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

 An instance needs to have a fixed hashcode. Removed the random call and just based it on id to match it with the equals implementation
*/
public class Exercise3 {

	public static class Person {

		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id.hashCode();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}