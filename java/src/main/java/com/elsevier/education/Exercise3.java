package com.elsevier.education;

/**
earlier test case is failing because it is creating 
new reference in test case because of different hashcode
now it is pointing to same reference  
*/
public class Exercise3 {

    public static class Person {
    
        private Integer id;
        
        public Person(int newId) {
            id = newId;
        }

        public int hashCode() {
            return id; 
        }
        
        public boolean equals(Object other) {
            return id.equals(((Person)other).id);
        }
    
        
    }
}