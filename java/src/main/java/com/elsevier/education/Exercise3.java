package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

 The issue causing the test to fail is due to the hashCode() method being invoked when adding an element to
 the set. Since a set can only contain unique objects, the implementation of hashCode() defined here will
 return different values for the same id due to the use of the Random generator being multiplied by the id. By
 definition, a hashCode must return the same value for the same input. This is problematic because we are interested
 in a hash value generated on the entire class, not just the id. Here I've chosen to simply remove hashCode()
 as well as the equals() method since they are not needed in this implementation; rather the hashCode and equals
 implementations provide in Object are sufficient.

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
/*
		public int hashCode() {

           return id * generator.nextInt();
		}

		public boolean equals(Object other) {
            return id.equals(((Person) other).id);
        }
*/
	}
}