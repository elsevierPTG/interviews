package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Yash Gupta
 */
public final class Exercise1 {

    public static final class Person {

        private Set<String> phoneNumbers;
        private String firstName;
        private String lastName;

        public Person(Set<String> newPhoneNumbers,String newFirstName,String newLastName ) {
            this.phoneNumbers = new HashSet<String>(newPhoneNumbers);
            this.firstName = newFirstName;
            this.lastName = newLastName;
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
