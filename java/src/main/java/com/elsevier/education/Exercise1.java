package com.elsevier.education;

import java.util.Collections;
import java.util.Set;

/**
 TODO: Make this class immutable.
 */
public class Exercise1 {

    public static class Person {

     // declare the below variables as constants
        private final Set<String> phoneNumbers;
        private final String firstName;
        private final String lastName;

        public Person(String firstName, String lastName, Set<String> phoneNumbers ) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumbers = Collections.unmodifiableSet(phoneNumbers);
        }

        public Set<String> getPhoneNumbers() {
            return phoneNumbers;
        }
        // commenting out setter so that outside world cannot reset the value of the variable.

      /*  public void setPhoneNumbers(Set<String> newPhoneNumbers) {
            phoneNumbers = newPhoneNumbers;
        } */


        public String getFirstName() {
            return firstName;
        }

        // commenting out setter so that outside world cannot reset the value of the variable.
     /*  public void setFirstName(String newName) {
            firstName = newName;
        }*/

        public String getLastName() {
            return lastName;
        }

        // commenting out setter so that outside world cannot reset the value of the variable.
      /*  public void setLastName(String newName) {
            lastName = newName;
        }*/
    }
}