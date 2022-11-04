package com.elsevier.education;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * TODO: Make this class immutable.
 *
 * The following was added to make the Person class immutable:
 *
 * 1. The instance variables are all made final such that there values cannot
 * change after creating the object
 *
 * 2. Person class is final such that it can not be sub classed.
 *
 * 3. all setter methods are removed such that the instance variables can not be
 * changed/modified.
 *
 * 4. getPhoneNumbers() returns a copy of the instance variable phoneNumbers
 * rather than the variable itself by cloning it
 */
public class Exercise1 {

    public final static class Person {

	private final HashSet<String> phoneNumbers;
	private final String firstName; // Strings are immutable, so need to
					// take any precaution here
	private final String lastName; // Strings are immutable, so need to take
				       // any precaution here

	public Person(String fn, String ln, Set<String> phoneNums) {
	    this.firstName = fn;
	    this.lastName = ln;
	    this.phoneNumbers = new HashSet<String>();
	    Iterator<String> it = phoneNums.iterator();
	    String value;
	    while (it.hasNext()) {
		value = it.next();
		this.phoneNumbers.add(value);
	    }
	}

	public String getFirstName() {
	    return this.firstName;
	}

	public String getLastName() {
	    return this.lastName;
	}

	@SuppressWarnings("unchecked")
	public HashSet<String> getPhoneNumbers() {
	    return (HashSet<String>) this.phoneNumbers.clone();
	}

	@Override
	public String toString() {
	    return (this.getFirstName() + ";" + this.getLastName() + ";" + this.getPhoneNumbers());
	}
    }

    public static void main(String[] args) {
	HashSet<String> pNums = new HashSet<String>();
	pNums.add("650-453-9393");
	pNums.add("678-383-9292");
	pNums.add("637-838-3939");
	Exercise1.Person ex1 = new Exercise1.Person("Hello", "World", pNums);
	ex1 = new Exercise1.Person("Baby", "World", pNums);
	System.out.println(ex1);
    }
}