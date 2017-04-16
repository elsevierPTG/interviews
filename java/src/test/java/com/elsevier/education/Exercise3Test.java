package com.elsevier.education;

import com.elsevier.education.Exercise3.Person;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Exercise3Test {

	@Test
	public void testAsElement() {

		Set<Person> people = new HashSet<>();

		Person p1 = new Person(1);
		people.add(p1);
		people.add(p1);

		assertEquals(1, people.size());

		Person p2 = new Person(2);
		for (int i = 0; i < 10; i++) {
			people.add(p2);
		}
		assertEquals(2, people.size());
	}
}
