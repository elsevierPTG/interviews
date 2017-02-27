package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {

 			int hashcode = 0;
 			hashcode = id.hashCode();
 			return hashcode;
  		}
  		

 		public boolean equals(Object obj) {
 			if(obj instanceof Person){
 				Person pp = (Person)obj;
 				return(pp.id == this.id);
 			}
 			else{
 				return false;
 			}
  		}
	}
}
