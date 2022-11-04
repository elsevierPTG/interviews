package com.elsevier.education;

import java.util.*;

/**

  For this, I used very simple equals and hashcode methods.
  If there was more state here, I would either use the equals and hashcode implementations as specified
  in Joshua Bloch's "Effective Java" book, or use one of the available equals and hashcode builders.

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
      return id.equals(((Person)other).id);
    }
  }
}
