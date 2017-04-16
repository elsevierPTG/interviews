package com.elsevier.education;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.elsevier.education.Exercise1.Person;

public class Exercise1Test {

	/**
	 * Test creating the Person class with a null phone number list
	 */
	@Test(expected = NullPointerException.class)
	public void TestImmutableClassWithNullPhoneNumbers() {
		Person person = new Person("Pradeep", "Prabhakar", null);
		assertEquals("Pradeep", person.getFirstName());
	}

	/**
	 * Test creating the Person class functionality
	 */
	@Test
	public void TestImmutableClass() {
		Set<String> phoneNumbers = new HashSet<String>();
		Person person = new Person("Pradeep", "Prabhakar", phoneNumbers);
		assertEquals("Pradeep", person.getFirstName());
		assertEquals("Prabhakar", person.getLastName());
		assertEquals(0, person.getPhoneNumbers().size());

		phoneNumbers.add("1234567890");
		phoneNumbers.add("1234567891");
		person = new Person("Pradeep", "Prabhakar", phoneNumbers);
		assertEquals("Pradeep", person.getFirstName());
		assertEquals("Prabhakar", person.getLastName());
		assertEquals(2, person.getPhoneNumbers().size());
	}
}
