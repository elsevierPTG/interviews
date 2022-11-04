package com.elsevier.education;

import java.util.*;

/*
 * Here since hashCode() method is using generator.nextInt() so every time the hashcode value of the 
 * object will be different. To be able to compare objects the hashCode() and equals() method
 * should return same value every time.
 * So we have to update below hashCode() method.
 *   
 */
public class Exercise3 {
public static class Person{
	private static Random generator = new java.util.Random();
	private Integer id;
	
	public Person(int newId){
		  id = newId;
	}
	
	public int hashCode() {
		return id.hashCode();
	}
	

	public boolean equals(Object other) {
		return id.equals(((Person)other).id);
	}

	
}
}
