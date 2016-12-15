package com.elsevier.education;

import java.util.*;

/**

 To fix the program, the hash is changed to be the id.
 HashSet internally uses hashes to classify objects.
 If two hashes are different, the objects themselves are
 considered to be different.  By removing the randomness from
 the hash method, Persons are now hashed by their id.  Now,
 adding the same user twice won't happen because the HashSet
 will encounter the same hash twice.

 Note: equals method was updated to check instance type before casting

 @author Joseph Cosentino
*/
public class Exercise3 {

    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();

        Person p1 = new Person(1);
        people.add(p1);
        people.add(p1);

        System.out.println(people.size());

    }

    public static class Person {

        private Integer id;

        public Person(int newId) {
            id = newId;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof Person)) {
                return false;
            }
            return id.equals(((Person)other).id);
        }
    }
}