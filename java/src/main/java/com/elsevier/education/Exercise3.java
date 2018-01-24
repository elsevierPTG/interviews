package com.elsevier.education;

/**
 * TODO Examine the failing test case for this class.
 * We should be able to call people.add() twice but end with only one object in it.
 * We can test with "gradlew test"
 * 
 * so, i'm not really sure of the motivation for using the random number generator for getting the hash code.
 * if there was a reason for it and it was to be utilized while still making it work then i totally missed the point (hopefully thats not the case).
 * one could also consider my solution to this cheating, as I just used the eclipse auto-generation tool for the hashcode and equals method.
 * not that the implementation of either method is difficult (though equals is always tedious).
 * more for the fact that i trust the heavily tested eclipse tool to handle cases i might miss for not paying close enough attention.
 * i also like to avoid using the reflection tools for auto-handling these two methods because the reflection operations can be very expensive.
 * 
 * if the random generator was supposed to be used, i'm very curious as to how that was supposed to work. please let me know.
 */
public class Exercise3 {

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
			if (getClass() != obj.getClass())
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