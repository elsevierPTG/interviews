package com.elsevier.education;

// import java.util.*;

/**
 * Really just decided to make it work. The author may want to see use of
 * HashCodeBuilder and EqualsBuilder commons modules for better hashcode
 * creation and equals check, but don't see the need with just this much.
*/
public class Exercise3 {

	public static class Person {
	
		//private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		// Simply do not manipulate the same id each time, 
		// all unique ids will remain unique even if serialized, then deserialized
		public int hashCode() {
			return id;// * generator.nextInt();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}