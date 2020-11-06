package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

  /**
   * An immutable class for representing a person. NOTE: The class is final so that it cannot be
   * extended.
   */
  public static final class Person {

    /**
     * All fields are private so that direct access is not allowed and final so that their value can
     * only be assigned once.
     */
    private final Set<String> phoneNumbers;
    private final String firstName;
    private final String lastName;

    /**
     * Constructor for creating a person. NOTE: Strings are inherently immutable. To achieve an
     * immutable set, make a deep copy of the set provided. This ensures that if the provided set of
     * phone numbers is changed, it will have no effect on this Person instance.
     *
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param phoneNumbers the person's phone numbers
     */
    public Person(String firstName, String lastName, Set<String> phoneNumbers) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNumbers = new HashSet<String>();

      for (String phoneNumber : phoneNumbers) {
        this.phoneNumbers.add(phoneNumber);
      }
    }

    /**
     * Get the person's phone numbers. NOTE: Provide a copy of the set of phone numbers so that any
     * changes to the returned set will not affect this Person instance.
     *
     * @return the person's phone numbers
     */
    public Set<String> getPhoneNumbers() {
      Set<String> phoneNumbersCopy = new HashSet<String>();

      for (String phoneNumber : phoneNumbers) {
        phoneNumbersCopy.add(phoneNumber);
      }

      return phoneNumbersCopy;
    }

    /**
     * Get the person's first name. NOTE: Strings are inherently immutable, so no precautions need
     * to be taken to maintain immutability.
     *
     * @return the person's first name
     */
    public String getFirstName() {
      return firstName;
    }

    /**
     * Get the person's last name. NOTE: Strings are inherently immutable, so no precautions need to
     * be taken to maintain immutability.
     *
     * @return the person's last name
     */
    public String getLastName() {
      return lastName;
    }
  }
}