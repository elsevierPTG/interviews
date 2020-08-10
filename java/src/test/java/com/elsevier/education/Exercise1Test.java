package com.elsevier.education;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

import com.elsevier.education.Exercise1.Person;

/**
 * just to make sure things are being set correctly and that the Set is unmodifiable
 *
 */
public class Exercise1Test {

	final String fName = "first";
	final String lName = "last";
	final Set<String> phoneNumbers = asList("555-555-5555","123-456-1234").stream().collect(Collectors.toSet());
	
	@Test
	public void assignsCorrectly(){
		final Person underTest = new Person(phoneNumbers, fName, lName);
		assertEquals(fName,underTest.firstName);
		assertEquals(lName,underTest.lastName);
		assertTrue(underTest.phoneNumbers.containsAll(phoneNumbers) && phoneNumbers.containsAll(underTest.phoneNumbers));
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void phoneNumbersNotModifyable(){
		final Person underTest = new Person(phoneNumbers, fName, lName);
		underTest.phoneNumbers.add("215-867-5309");
	}
}
