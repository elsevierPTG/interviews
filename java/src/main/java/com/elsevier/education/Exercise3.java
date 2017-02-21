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
		public Integer getId(){
			return id;
		}
		
		public int hashCode() {
			return id * generator.nextInt();
		}
		
		public boolean equals(Object other) {
//			return id.equals(((Person)other).id);
			Person person=(Person)other;
			return (this.getId()==person.getId());
		}
		public String toString(){
			return "id:"+id;
		}
	}
	
public static void main(String args[])	{
	HashSet<Person> persons=new HashSet<Person>();
	person.add(new Person(1));
	person.add(new Person(2));
	System.out.println("before adding duplicate");
	for(Person pr:persons){
		System.out.println("item:"+pr);
	}
	Person duplicate=new Person(1);
	persons.add(duplicate);
	System.out.println("after adding duplicate object");
	for(Person pr:persons){
		System.out.println("item"+pr);
	}
}//end of main method
	
}
