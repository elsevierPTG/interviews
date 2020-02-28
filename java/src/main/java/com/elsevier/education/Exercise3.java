package com.elsevier.education;

import java.util.*;

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
			//removed the random number as it would cause uniqe hash values which is why it was getting added twice.
			return id ;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}