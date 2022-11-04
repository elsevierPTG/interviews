package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

Explanation : We can remove the id getting multiplied with a random value (and this changing its value) to make the TestCase work by
			  having only one element in the Set. This happens because now we insert the two Person objects in the Set with the same value 
			  and the equals method in Person class is having a simple check to identify whether it has the same value of the variable id.
			  Thus, as per the property of Set to ignore additions of objects with same value (because it identifies that by the equals method we have here),
			  we will get only one value in the set even when adding it twice and the Test Case to Assert whether size of the Set is 1 or not will start working.
		  
*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
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