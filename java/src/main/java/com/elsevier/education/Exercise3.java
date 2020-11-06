package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

 1.  The hashCode() method is overrode incorrectly with returning a pseudo-random 
 number.  For two object to be equal, their values of hashCode must be equal.

*/
public final class Exercise3 {

	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {
			if (this == other) return true;
			if (other == null) return false;
			if (!(other instanceof Person)) return false;
			Person otherPerson = (Person) other;
			return (id == otherPerson.id) || (id != null && id.equals(otherPerson.id));
		}
	}
}