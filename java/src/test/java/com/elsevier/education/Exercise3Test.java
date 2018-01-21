package com.elsevier.education;

import java.util.*;
import com.elsevier.education.Exercise3.Person;
import static org.junit.Assert.*;
import org.junit.Test;

public class Exercise3Test {

    @Test
    public void testAsElement() {

        Set<Person> people = new HashSet<>();

        Person p1 = new Person(1);
        Person p1b = new Person(1);
        
        people.add(p1);
        people.add(p1);
		assertEquals(1, people.size());

		//p1 and p1_b have the same ID, but different hashes, so they are "equal," but will both be added to the HashSet
		people.add(p1b);
		assertEquals(p1, p1b);
		assertTrue(p1.hashCode() != p1b.hashCode());
		assertEquals(2, people.size());
    }
}
