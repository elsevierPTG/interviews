package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 
 I am not sure why a generator was involved at all, assuming that id is unique for all Persons
 then it is fine to be hashCode on it's own. This will ensure that the equals() method will consistently
 retrieve the same hashCode for Persons of the same id, fixing the test case.

*/
public class Exercise3 {

	public static class Person {
	
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