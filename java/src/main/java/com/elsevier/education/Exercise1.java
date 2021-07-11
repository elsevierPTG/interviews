package com.elsevier.education;

import java.util.Set;
import java.util.HashSet;
/**

TODO: Make this class immutable.

 AM:  for the sake of time I propbably could have written a method do the cloning to avoid uses unchecked or
 unsafe operations. I added some test to ensure modifing the get vairable or the orginal didn't cause the
 item to be modified.  All setters removed


*/
public class Exercise1 {

	public static final class Person {
		
		private  final Set<String> phoneNumbers;
		private  final String firstName;
		private  final String lastName;
		
		public Person(String fName, String lName, Set<String> pNumbers) {
			this.firstName=fName;
			this.lastName=lName;
			//prevents modifiation from orig variable
			this.phoneNumbers=((Set) ((HashSet) pNumbers).clone());
		}

		public Set<String> getPhoneNumbers() {
            //prevents modifiation from variable based on the getter
			return ((Set) ((HashSet) phoneNumbers).clone());
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}
	}

//		public static void main(String a[]){
//			Set<String> phoneNumbers = new HashSet<String>();
//			phoneNumbers.add("12321321");
//			phoneNumbers.add("123213213213");
//			Person p = new Person("bob","saget",phoneNumbers);
//			System.out.println(p.getPhoneNumbers().toString());
//			Set<String> phoneNumbers2 = p.getPhoneNumbers();
//			phoneNumbers2.add("123213213213213213213");
//			phoneNumbers.add("232132132132132132131331");
//			System.out.println(p.getPhoneNumbers().toString());
//
//	}
}