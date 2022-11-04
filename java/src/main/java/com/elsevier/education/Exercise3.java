package com.elsevier.education;

/**

I could have kept the random generator, removing it from hashCode() and
using it to generate the 'id' (and removing the constructor arg for that),
but that would require me to change the unit test, which I'm interpreting
as the "source of truth" here about the rest of the imaginary project setup.

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