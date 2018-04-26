package com.elsevier.education;

/**
 * TODO Examine the failing test case for this class.
 * We should be able to call people.add() twice but end with only one object in it.
 * We can test with "gradlew test"
 */
public class Exercise3 {

    public static class Person {

        private Integer id;

        public Person(int newId) {
            id = newId;
        }

        public int hashCode() {
            return 1 + (id == null ? 0 : 31 * id); // use a basic hash code implementation for HashSet to check object by hashcode.
        }

        public boolean equals(Object other) {
            return id.equals(((Person) other).id);
        }
    }
}