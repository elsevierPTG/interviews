package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

 [aziring] Evaluation of failing test:

 HashSets are backed by HashMaps where the hashCode is the key for each entry.  When a new
 object is trying to be added to the HashSet, the first comparison for equality that is checked
 is the hashCode.  If that is unique, then it is assumed that the object is unique and its added.
 If the hashCode is already in the map backing by the HashSet, then the object reference is compared
 to the object reference pointed to at that map entry.  If the references are equals, then it is
 assumed that the object is duplicate.  Lastly, if the hashCode already exists, the equals method
 is executed to determine uniqueness.

 In this case, the randomly generated number used in the hashCode method ensures that every
 hashCode is unique.  To solve this issue, the hashCode needs to be generated in a way that
 like objects will generate the same hashCode.  Another aspect to note about the failing test,
 is that the duplicate object being inserted fails on the reference evaluation and the equals
 method is not used in this test.  To accurately test that the equals method has been overridden
 successfully, the test needs to generate a new Person object and attempt to add it to the HashSet.

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id * generator.nextInt();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}