package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

/**
 * Created by Yash Gupta
 */
public class Exercise3 {

    public static void main(String[] args) {

        Set<Person> people = new HashSet<Person>();

        Person p1 = new Person(1);
        people.add(p1);
        people.add(p1);

        System.out.println(people.size());

    }

    public static class Person {

        private static Random generator = new java.util.Random();
        private Integer id;

        public Person(int newId) {
            id = newId;
        }

        public int hashCode() {
            final int prime = 47;
            int hashValue = 1;
            hashValue = prime * hashValue + ((id == null) ? 0 : id.hashCode());
            return hashValue;
        }

        public boolean equals(Object other) {
            return id.equals(((Person)other).id);
        }

    }
}
