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

		// use correct equals implementation. Previous can throw NPE
		@Override
		public boolean equals(Object that) {
			if (this == that) {
				return true;
			}

			if (that == null || this.getClass() != that.getClass()) {
				return false;
			}

			Person person = (Person) that;

			if (this.id != null) {
				return this.id.equals(person.id);
			} else {
				return person.id == null;
			}
		}

		// fix hashcode method. In a previous one it was incorrect, it returns different hashcode each time method
		// called. This will make impossible to find this element in hashmap.
		@Override
		public int hashCode() {
			return id != null ? id.hashCode() : 0;
		}
	}
}