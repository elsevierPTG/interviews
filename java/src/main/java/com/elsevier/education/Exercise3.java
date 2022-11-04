package com.elsevier.education;

import java.util.Objects;

/**
 * TODO Examine the failing test case for this class. We should be able to call people.add() twice
 * but end with only one object in it. We can test with "gradlew test"
 *
 */
public class Exercise3 {

  public static class Person {

    // Random generator is no longer needed.
    //private static Random generator = new java.util.Random();
    private Integer id;

    public Person(int newId) {
      id = newId;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode(java.lang.Object)
     */
    @Override
    public int hashCode() {
      // This implementation violates the contract of hashCode. Namely, hashCode needs to return the
      // same integer value each time it is called on an object, provided that no information used
      // in equals comparisons on the object is modified.
      // This caused the unit test to fail because HashSets are backed by HashMaps and when we try
	  // to add the person to the HashSet the second time, we get a different hash code, hence 
	  // allowing the second add to the set.
      //return id * generator.nextInt();

      // Since Java 7, this is a simple way to generate a hash code for a sequence of values.
      // Alternatively, your IDE may provide a way to generate a hashCode, you could use a library
      // like Guava to generate a hashCode, or, if necessary, create your own implementation of
      // hashCode, ensuring that it adheres to the hashCode contract
      return Objects.hash(id);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
      // IDEs like Eclipse do a good job of generating hashCode and equals methods
      if (this == obj) {
        return true;
      }
      if (obj == null) {
        return false;
      }
      if (getClass() != obj.getClass()) {
        return false;
      }
      Person other = (Person) obj;
      if (id == null) {
        if (other.id != null) {
          return false;
        }
      } else if (!id.equals(other.id)) {
        return false;
      }
      return true;
    }
  }
}
