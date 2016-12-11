package com.elsevier.education;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 */
public class Exercise1 {

    public static class Person {

        private Set<String> phoneNumbers;
        private String firstName;
        private String lastName;

        private  Person() { // default constructor should never being used
        }

        // the only available constructor
        public Person(String firstName, String lastName, Set<String> phoneNumbers) {
            this.firstName = firstName;
            this.lastName = lastName;
            //must make a deep copy for Set
            this.phoneNumbers = new HashSet<String>();
            this.phoneNumbers.addAll(phoneNumbers);
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
        
        // no data should be made available for changes once set in the constructor 
        // i.e. this class produces only "immutable" objects 
    }

    public static void main(String[] args) {
        String result = "";
        String match = "";
        String firstName = "Alex";
        String lastName = "Leshinsky";
        Set<String> phoneNumbers = new HashSet<String>(Arrays.asList("215-555-1212", "215-555-1313"));

        Person alexLeshinsky = new Person(firstName, lastName, phoneNumbers);

        //verify First Name
        result = "First name - ";
        match  = ((firstName.equalsIgnoreCase(alexLeshinsky.getFirstName())) ? "match" : "no match");
        System.out.println(result + match);

        //verify Last Name
        result = "Last name - ";
        match  = ((lastName.equalsIgnoreCase(alexLeshinsky.getLastName())) ? "match" : "no match");
        System.out.println(result + match);

        //verify Phone Numbers
        result = "Phone numbers - ";
        match  = (phoneNumbers.size() == alexLeshinsky.getPhoneNumbers().size()) ? "match" : "no match";
        System.out.println(result + match);

        //verify Phone Numbers withstand mods to original source
        phoneNumbers.clear();
        result = "Phone numbers - ";
        match  = (phoneNumbers.size() == alexLeshinsky.getPhoneNumbers().size()) ? "unstable" : "stable";
        System.out.println(result + match);
    }
}