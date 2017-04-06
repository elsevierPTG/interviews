package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 hashCode() method implementation is wrong. In order to two objects are equals,
 hashCode should be equals. But here generator will generator different number when method executes.

*/
public class Exercise3 {

	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			int result = 17;
			result += 31*result + id;
			return result;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}