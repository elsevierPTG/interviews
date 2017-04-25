package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**
TO Make this class immutable we use the final key word
for class and variables. We remove setters, make constructor 
private  and construct instances in factory methods
*/
public class Exercise1 {

    public static void main(String[] args) {
        HashSet<String> phoneNumbers = new HashSet<String>();
        phoneNumbers.add("215-333-4444");
        Person person = new Person(phoneNumbers, "firstName", "lastName");
        //checking immutable output  with different phone number 
        System.out.println("Person First Name is:"+person.getFirstName()+" & Person Last Name is:"+person.getLastName()+"Person phone numbers are:"+ person.getPhoneNumbers());
        phoneNumbers.add("816-555-6666");
        System.out.println("Person First Name is:"+person.getFirstName()+" & Person Last Name is:"+person.getLastName()+"Person phone numbers are:"+ person.getPhoneNumbers());

    }
  public static final class Person {
        
        private final Set<String> phoneNumbers;
        private final String firstName;
        private final String lastName;
        
        //ideally constructor could be private for immutable class
        public Person(Set<String> phoneNumbers, String firstName, String lastName) {
            //new objects(new HashSet) with copied content for all mutable objects
            this.phoneNumbers = new HashSet<String>(phoneNumbers);
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