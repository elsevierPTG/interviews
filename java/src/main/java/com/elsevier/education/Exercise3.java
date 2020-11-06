package com.elsevier.education;

import com.elsevier.education.Exercise3.Person;

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
		/**We need to make sure everytime 
		 * Person object return hashcode value is unique until no values are modified for that object.
		 * If we are looking for getting single object returning, even values are modified, 
		 * then we need to return some constant value in hashCode method. then everytime it will return same hashcode value.
		 * How many times we create object and add to set. it will return single object only.
		 * 
		 * **/
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}