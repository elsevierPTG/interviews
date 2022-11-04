package com.elsevier.education;

/**
 * 
 * As two objects that are equal must have the same hashCode and a Person object is uniquely identified by id, I simply modified 
 * the hashCode method to return the hash code of the id.  
 *
 * @author JFracassi
 *
 */
public class Exercise3 {

	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id.hashCode(); 
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
		
	}
	
}