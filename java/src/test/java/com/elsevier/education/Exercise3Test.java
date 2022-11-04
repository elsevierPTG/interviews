package com.elsevier.education;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.elsevier.education.Exercise3.Person;

public class Exercise3Test {

    @Test
    public void testAsElement() {

	Set<Person> people = new HashSet<>();
	HashSet<String> newset = new HashSet<String>();

	// populate hash set
	newset.add("Learning");
	newset.add("Easy");
	newset.add("Simply");
	newset.add("Simply");
	System.out.println("Hash set values: " + newset);
	System.out.println("Hash set values: " + people);

	Person p1 = new Person(1);
	people.add(p1);
	people.add(p1);
	people.add(p1);

	assertEquals(1, people.size());
    }
}