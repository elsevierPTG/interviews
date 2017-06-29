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


		/**
		 * added the proper overridden method equals
		 *
 		 * @param o
		 * @return boolean
		 */
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;

			Person person = (Person) o;

			return id != null ? id.equals(person.id) : person.id == null;
		}

		/**
		 * added the proper overridden method hashCode
		 * @return int
		 */

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}


	}
}