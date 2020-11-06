package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 
 Answer:
 Assumption:  someone wanted a Person class, where two persons with same id, if NOT the same object (or deep copies), are
 not considered the same.  Otherwise this whole generator.nextInt() logic had little point and could just be removed.
 
 For a Set to check equality, it will call the hashCode method (and perhaps also the equals method) 
 (It checks that to peform its deduping functionality.  Sets are to contain unique items)
 This method was improperly written to use a new random int each time. The hasCode for a given object will return 
 different values on subsequent calls (breaks the hashCode contract).
 We want to call the random generator once on creation of the object, store it, and then reuse it.
 
 Note, with enough calls, it is possible for the random number generator to repeat.
 So still possible an individual with same ID will not be differentiated (why is this wanted in the first place?)
 This will be very improbable and most likely a non-issue.

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		private Integer randomInt;
		
		public Person(int newId) {
			id = newId;
			randomInt = generator.nextInt();
		}
		
		//will now return same value on every call on same object
		public int hashCode() {
			return id * randomInt;
		}
		
		//with my stated assumption, this also needs updating
		public boolean equals(Object other) {
			return id.equals(((Person)other).id) && randomInt.equals(((Person)other).randomInt);
		}
	}
}
