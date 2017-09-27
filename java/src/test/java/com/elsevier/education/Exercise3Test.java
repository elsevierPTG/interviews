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
        people.add(p1);
        people.add(p1);

        assertEquals(1, people.size());
    }

    @Test
    public void testTwoNonequalElements() {

        Set<Person> people = new HashSet<>();

        Person p1 = new Person(1);
        Person p2 = new Person(2);
        people.add(p1);
        people.add(p2);

        assertEquals(2, people.size());
    }
}
