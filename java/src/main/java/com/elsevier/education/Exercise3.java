package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 
 -- To make the test case work for same id vale we have to return the same hashcode value 
    and equals method has to return true. Then only has Hashset will consider them as unique values.
    In our case to generate the hashcode we are multiplying id with a random int, so for same id the 
    hashcode may or may not be same. So testcase will fail most of the time. Here I have used the Eclipse
	generated hashode and equals method.
*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		/*public int hashCode1() {
			return id * generator.nextInt();
		}
		
		public boolean equals1(Object other) {
			return id.equals(((Person)other).id);
		}*/

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