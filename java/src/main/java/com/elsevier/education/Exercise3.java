package com.elsevier.education;

/**
Candidate : Jin W. Chen
Email : JinWChen@yahoo.com
recruiter :
Linda Pham | Technical Recruiter
JOBSPRING PHILADELPHIA 
Office: (267) 765-6100

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {

		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {

			if (other == this) {
				return true;
			}
				
			if (!(other instanceof Person)) {
				return false;
			}
				
			return id.equals(((Person)other).id);
			
		}
	}

}
