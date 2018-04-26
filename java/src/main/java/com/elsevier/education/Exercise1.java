package com.elsevier.education;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * TODO: Make this class immutable.
 */
public class Exercise1 {

    public static class Person {

        private final Set<String> phoneNumbers;
        private final String firstName;
        private final String lastName;

        public Person(Set<String> phoneNumbers, String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumbers = new LinkedHashSet<>(phoneNumbers); // create a new set for phone numbers, in case the input gets modified
        }

        public Set<String> getPhoneNumbers() {
            return Collections.unmodifiableSet(this.phoneNumbers); // return an immutable set
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}