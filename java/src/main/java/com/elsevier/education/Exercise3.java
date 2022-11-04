package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 
 @author ArnelLalicon - removed generator.nextInt() from hashcode method. 
 The hashcode method is used by Set object when comparing two classes. The reason why test was failing because
 the generator.nextInt() is generating different values all the time. Thus even if the id is the same, the result will 
 always be different. So by removing random generator, the hashcode will be the same for all objects that have the same id.

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
