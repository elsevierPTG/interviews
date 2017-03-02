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
		
		/* 
		Hashcode method should return hash code value of Person id, so that if you add Person p1 for first time, the object p1 will be stored 
		in bucket array with hashcode value. 
		 */
		public int hashCode() {
			return id.hashCode();
		}
		
		/*
		 When we add Person p1 for the second time since hashcode value is same, it goes for same bucket location and check for equals. 
		 If equals return true, it will override the old p1 object.
		 */
		public boolean equals(Object other) {
			if (other instanceof Person) {
				Person pp = (Person) other;
				return (pp.id == this.id);
			} else {
				return false;
			}
		}
	}
}
