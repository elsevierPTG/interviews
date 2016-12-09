package com.elsevier.education;
import java.util.*;

/**
 can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3
 TODO We should be able to call people.add() twice but end with only one object in it.
 */

/**
 * We are asserting that the property 'id' of the the Person object is unique.
 */
public class Exercise3 {

    public static void main(String[] args) {

        Set<Person> people = new HashSet<Person>();

        // how many ever times we call people.add(), we will end up with the first set of elements we have added.
        for (int i = 0; i < 100; i++) {
            Person p = new Person(i);
            people.add(p);
        }
        for (int i = 0; i < 100; i++) {
            Person p = new Person(i);
            people.add(p);
        }

        System.out.println(people.size());

    }

    public static class Person {

        private static Random generator = new java.util.Random();
        private Integer id;

        public Person(int newId) {
            id = newId;
        }

        public int hashCode() {
              return id.hashCode();
        }

        public boolean equals(Object other) {
            /**
             * if two objects have to be equal, the hashcode has to be equal
             */
            return id.equals(((Person) other).id);
        }
    }
}