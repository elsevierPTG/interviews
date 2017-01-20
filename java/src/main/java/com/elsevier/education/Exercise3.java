package com.elsevier.education;

public class Exercise3 {

	/**
	 * I just removed the random since it seems that each person
	 * is unique per their id.   
	 */
	public static class Person {
		
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