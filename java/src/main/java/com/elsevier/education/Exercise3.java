package com.elsevier.education;

import java.util.*;

/**

@author Todd Goglia 8/22/2017
Fixed a bug where a new distinct hashcode was generated for each subsequent call to hashCode() by moving
the call call to the Random.nextInt() to the constructor and creating a member variable to hold the value.

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		private Integer hashCode;
		
		public Person(int newId) {
			id = newId;
			this.hashCode = generator.nextInt();
			
		}
		
		public int hashCode() {
			return this.hashCode;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}