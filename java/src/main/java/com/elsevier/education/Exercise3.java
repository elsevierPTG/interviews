package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

 I'm not running some bash script on my machine. The build.gradle file should be setup appropriately to begin with.

 Granted I 'cheated' and installed Gradle on my Ubuntu machine before beginning but I needed to do a little more system administration that I did not want to include in the 30 minute time limit.

 If I'm expected to complete this test in 30 minutes it sure as shit won't involve me reading every line of code in some random bash file off the internet.

*/
public class Exercise3 {

	public static class Person {

		//This isn't even a seeded RNG? Perhaps the documentation for java.util.Random() admits the default seed is System.now().
		//I certainly hope so.
		private static Random generator = new java.util.Random();
		private Integer id;

		// Autoboxing a primite int to a Integer class? Sounds like a great recipe for sucess.
		public Person(int newId) {
			id = newId;
		}

		// This looks real dumb. Apache Commons or other libraries have already invented this wheel.
		public int hashCode() {
			return id * generator.nextInt();
		}

		// This rampant dereferncing and class casting on one line is sloppy.
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}