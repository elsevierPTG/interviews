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
}
