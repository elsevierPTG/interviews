package com.elsevier.education;

public class Exercise3 {

	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		/**
		 * Hash code should not be unique for every instance of Person. 
		 * It should be depend on internal state and return the same hash for all persons with same ID. 
		 */
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}