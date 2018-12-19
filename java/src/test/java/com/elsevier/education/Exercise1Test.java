package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Exercise1Test {

    @Test(expected = UnsupportedOperationException.class) 
    public void cannot_modify_immutable_person_object_once_created() {

    	String firstName = new String ("Naveen");
		String lastName = new String ("Kumar");
		Set<String> phoneNumbers = new HashSet<>(); 
		phoneNumbers.add("800-123-4567");
		phoneNumbers.add("888-123-4567");
		
		Exercise1.Person person = new Exercise1.Person(firstName, lastName, phoneNumbers);
		
		phoneNumbers.add("900-123-4567");
		phoneNumbers.add("999-123-4567");
		
		Assert.assertTrue(person.getPhoneNumbers().size() == 2);

		person.getPhoneNumbers().add("100-123-4567");
		
    }
}
