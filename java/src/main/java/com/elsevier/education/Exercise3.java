package com.elsevier.education;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	/**
	 * Implementation of a Person.
	 * <p>
	 * Assigns an int at creation to allow consistent resolving of the hashCode value for this object.
	 * Implements the equals function that compares both the id and hashCode to determine equality.
	 */
	public static class Person {
		private final Integer id;
		private int hcFactor;

		/**
		 * Constructs and initializes a new Person.
		 *
		 * @param newId
		 *        The id assigned to this Person.
		 */
		public Person(int newId) {
			this.hcFactor = new java.util.Random().nextInt();
			this.id = newId;
		}

		/**
		 * Returns the Id for this Person.
		 *
		 * @return
		 *        The Id of the Person.
		 */
		public int getId(){
		     return this.id;
		}

		/**
		 * Returns the hashCode for this Person.
		 *
		 * @return
		 *        The hashCode of the Person.
		 */
		public int hashCode() {
			return this.id * this.hcFactor;
		}

		/**
		 * Test for equaility between this person and other Objects.
		 *
		 * @return
		 *        True if the object being compared is equal to this Person object,
		 *        otherwise false.
		 */
		public boolean equals(Object other) {
			return other != null &&
					getClass() == other.getClass() &&
					id.equals(((Person)other).id) &&
					hashCode() == ((Person)other).hashCode();
		}
	}
}