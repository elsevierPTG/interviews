package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {


	/**
	 * Defines a Person with modification to the hashCode method
	 * 
	 * @author Rai Singh
	 * 
	 * Recruiter: Linda Pham, Jobspring Partners
	 * 	 
	 */
	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		/**
		 * Using the result of a {@link Random} generator as part of hashCode
		 * when the equals method does not vary in the same regard, will result
		 * in inconsistency between these two methods (i.e. equals and
		 * hashCode).
		 */
		public int hashCode() {
			return id.hashCode();
		}
		
		/**
		 * Some additional defensive checks would be needed here to check for
		 * null and object identity (== comparison), but that by itself would
		 * not prevent duplicate entries from being added to a collection.
		 */
		public boolean equals(Object other) {
			if (!(other instanceof Person))
				return false;	
			if (other == this)
				return true;			
			return id.equals(((Person)other).id);
		}
	}
}