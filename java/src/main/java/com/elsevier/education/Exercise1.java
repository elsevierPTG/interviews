package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Steps to make Person strongly immutable:
 *
 * 1) Make the class final
 *     -  This ensures that mutable state cannot be added
 *        via an overriding type.
 * 2) Remove setter methods
 *     -  Having methods that change the object state
 *        defeat the concept of immutability
 * 3) Make fields final
 *     - This prevents state from being changed after initially set
 * 3) Add constructor so that state can be set initially
 *     a) Phone numbers are copied to a new set, so Person
 *        doesn't retain a reference to the original set.
 *        Since phone numbers are represented as Strings,
 *        which are immutable, we don't need to worry about
 *        references to the elements getting mutated
 *     b) Copied phone numbers are added to an unmodifiable set,
 *        which ensures that the set cannot be modified after
 *        retrieving it from getPhoneNumbers().
 *
 * @author Joseph Cosentino
 */
public class Exercise1 {

    public static final class Person {

        private final Set<String> phoneNumbers;
        private final String firstName;
        private final String lastName;

        public Person(Set<String> phoneNumbers, String firstName, String lastName) {
            this.phoneNumbers = Collections.unmodifiableSet(new HashSet<>(phoneNumbers));
            this.firstName = firstName;
            this.lastName = lastName;
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