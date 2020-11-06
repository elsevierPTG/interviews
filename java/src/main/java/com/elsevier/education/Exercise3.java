package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

Note:

Since I can't run gradle on my machine - I have no clue nor do I have gradle 
installed on my machine, I copied the code to another project to test it and 
removed the Random number generator and reference thereto.  I just return the id
in the hashCode so it'll always return the same number for the same object multiple times.
*/
public class Exercise3
{
	public static class Person
	{
		private Integer id;
		
		public Person(int newId)
		{
			id = newId;
		}
		
		public int hashCode()
		{
			return(id);
		}
		
		public boolean equals(Object other)
		{
			return(id.equals(((Person)(other)).id));
		}
	}
}