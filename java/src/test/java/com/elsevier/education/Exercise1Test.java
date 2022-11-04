package com.elsevier.education;

import java.util.*;
import com.elsevier.education.Exercise1.Person;
import static org.junit.Assert.*;
import org.junit.Test;

public class Exercise1Test {

    @Test
    public void testNotModifiable() {
		Set<String> phoneNumbers = new HashSet<>();
		phoneNumbers.add("111-111-1111");
		phoneNumbers.add("777-777-7777");
		Person p1 = new Person(phoneNumbers, "Bob", "Newhart");
		p1.getPhoneNumbers().add("555-555-5555");
		phoneNumbers.add("444-444-4444");
		System.out.println(p1.getPhoneNumbers());

		assertEquals(2, p1.getPhoneNumbers().size());
    }
}
