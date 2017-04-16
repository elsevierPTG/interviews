package com.elsevier.education;

/**
 * Changed the hashCode method to return the hashCode of the id. Id is treated
 * as the primary key for POJO. So for comparison and hashCode, Id is used as
 * the unique key
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
			return id.equals(((Person) other).id);
		}
	}
}