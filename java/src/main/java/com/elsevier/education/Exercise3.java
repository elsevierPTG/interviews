package com.elsevier.education;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	/**
	 * The code was refactored to use a well-defined implementation of hashCode and equals.
	 * <p>
	 * The main problem with the previous hashCode implementation was that it
	 * would return different hashCode values for "equal" Person instances
	 * (when the id's are the same value).
	 * <p>
	 * Collections depend on the property that if two objects are
	 * "equal", then they must generate the same hashCode values.
	 * <p>
	 * So the test initially failed because when calling add on Set, it first
	 * checks the hashCode of the object. If there are no object's in the set
	 * with that hashCode, then it will add it to the set. Since the two objects
	 * generated different hashCodes, the Set contained 2 elements instead of the expected 1.
	 * <p>
	 * Now the two instances will generate the same hashCode, will be equal, and
	 * so the second call to add will not add an element to the Set.
	 */
	public static class Person {
		private Integer id;

		public Person(int newId) {
			id = newId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Person))
				return false;
			Person other = (Person) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
	}
}