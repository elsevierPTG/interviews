package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
 /**
 * 
 * @author swapnilkulkarni
 * @author swapnilkulkarni 
 * email - kulswapnil@gmail.com
 * cell - 267 844 5443
 * recuiter - collabera
 * Added a new variable to hold the hashcode value
 * Compare the hashcode value in equals method.
 *  */
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		public Integer result;
		
		public Integer getResult() {
			return result;
		}

		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			result = id * generator.nextInt();
			return result.intValue();
		}
		
		public boolean equals(Object other) {
			return result.equals(((Person)other).getResult());
		}
	}
}
