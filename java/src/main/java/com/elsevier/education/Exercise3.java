package com.elsevier.education;

/**
 * Assuming the id field uniquely identifies the person class, the hashcode /
 * equal contract was modified to return an accurate representation of the
 * person
 * 
 * from Effective Java: Item 9: Always override hashCode when you override
 * equals
 * 
 * @author todd weber
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
			if (this == other) {
				return true;
			}

			if (!(other instanceof Person)) {
				return false;
			}

			return id.equals(((Person) other).id);
		}
	}
}