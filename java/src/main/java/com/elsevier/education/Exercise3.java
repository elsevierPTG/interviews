package com.elsevier.education;

import java.util.*;

/**

can run with gradlew clean build; java -cp build/classes/main com.elsevier.education.Exercise3

TODO We should be able to call people.add() twice but end with only one object in it.

*/
public class Exercise3 {

	public static void main(String[] args) {
	
		Set<Person> people = new HashSet<>();
	
		Person p1 = new Person(1);
		people.add(p1);
		people.add(p1);
		
		System.out.println(people.size());
		
	}
	
	public static class Person {
	
		//removed the Random generator class as it is not required. 
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}

		public Integer getId(){         // created getter for id.
		        return this.id;      
            	}
	
	        public void setId(Integer id){   // created setter for id.
		        this.id=id;
	        } 
		public int hashCode() {
			return id.hashCode();  // hashCode of the id has been used to return the same value whenever it is called on the same id.                             
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).getId());
		}
	}
}
