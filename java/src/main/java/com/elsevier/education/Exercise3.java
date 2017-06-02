package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

 We can do this by ensuring that hashCode has the same key if the value is the same
 We are generating a new key my using the Random number generator. If we remove this
 then we are trying to add a second object with the same key and it will not add the
 object the second time
*/
public class Exercise3 {

    public static class Person {
        
        private Integer id;

        public Person(int newId) {
            id = newId;
        }

        public int hashCode() {
            return id ;
        }

        public boolean equals(Object other) {
            return id.equals(((Person)other).id);
        }
    }
}