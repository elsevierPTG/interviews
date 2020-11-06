package com.elsevier.education;

/**
* 1. Assuming that test case scenario where more than one user with the same id is allowed, randomization is not necessary.
* @author Boris Filipov
*/
public class Exercise3 {

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