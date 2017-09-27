package com.elsevier.education;

import java.util.*;
import com.elsevier.education.Exercise1.Person;
import static org.junit.Assert.*;
import org.junit.Test;

public class Exercise1Test {

    @Test
    public void testSetImmutability() {

        String firstName = "Joshua";
        String lastName = "Karstendick";
        Set<String> phoneNumbers = new HashSet<String>();
        phoneNumbers.add("111-111-1111");
        phoneNumbers.add("222-222-2222");

        Person p = new Person(firstName, lastName, phoneNumbers);
        assertEquals("Joshua", p.getFirstName());
        assertEquals("Karstendick", p.getLastName());
        assertEquals(phoneNumbers, p.getPhoneNumbers());

        phoneNumbers.add("666-666-6666");
        assertNotEquals(phoneNumbers, p.getPhoneNumbers());
    }
}
