package com.elsevier.education;

import java.util.*;

/**
 * A hashCode function with a non-deterministic output makes object comparison
 * non-deterministic. Simply returning the id field from the hashCode function
 * leads to the desired behavior.
 *
 * But really, there's no need to implement the hashCode and equals functions
 * ourselves. By removing those and relying on the defaults instead, we retain
 * the correct behavior while also increasing the clarity and maintainability
 * of this class.
 */
public class Exercise3 {

	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
	}
}
