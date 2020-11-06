package com.elsevier.education;

import java.util.*;
import com.elsevier.education.Exercise1.Person;
import static org.junit.Assert.*;
import org.junit.Test;

public class Exercise1Test {
	/**
	 * Consider adding:
	 *   1. A multi-threaded test.
	 *   2. A test which attempts to change member vars using reflection.
	 */

    @Test
    public void testImmutability() {
    	String firstName = "John";
    	String lastName = "Doe";
    	Set<String> phoneNums = (Set<String>) new TreeSet<String>();
    	phoneNums.add("123-456-7890");
    	phoneNums.add("012-345-6789");
    	Set<String> testPhoneNums = (Set<String>) new TreeSet<String>();
    	Exercise1 ex1 = new Exercise1();
    	Exercise1.Person person = ex1.new Person(firstName, lastName, phoneNums);
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
    	testPhoneNums.add("123-456-7890");
    	testPhoneNums.add("012-345-6789");
    	// Test
    	assertTrue(person.getPhoneNumbers().containsAll(testPhoneNums));
    	assertTrue(person.getPhoneNumbers().size() == 2);
    	// Modify local variable values
    	firstName = "jack";
    	lastName = "nobody";
    	phoneNums = (Set<String>) new TreeSet<String>();
    	phoneNums.add("000-000-0001");
    	phoneNums.add("000-000-0002");
    	// Recheck the immutable person.
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
    	assertTrue(person.getPhoneNumbers().containsAll(testPhoneNums));
    	assertTrue(person.getPhoneNumbers().containsAll(testPhoneNums));
    }
    
    
}
