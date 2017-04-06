package com.elsevier.education;

import java.util.Set;
import java.util.Collections;

/**

  This solution uses unmodifiable collections and removes setters.

  It also changes the classes interface, and is built such that a Person needs to be constructed with all fields.

  If this is a problem, or if we don't have all the data, but want to add fields outside of the constructor,
  then we could add some methods (eg: Person withName('john')) that return a new Person object.

*/
public class Exercise1 {

  public static class Person {

    private final Set<String> phoneNumbers;
    private final String firstName;
    private final String lastName;

    public Person(final String first, final String last, final Set<String> phones) {
      phoneNumbers = Collections.unmodifiableSet(phones);
      firstName    = first;
      lastName     = last;
    }

    public Set<String> getPhoneNumbers() {
      return phoneNumbers;
    }

    public String getFirstName() {
      return firstName;
    }

    public String getLastName() {
      return lastName;
    }
  }
}
