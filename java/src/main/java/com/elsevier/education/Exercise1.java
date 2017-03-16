package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		// Here we need to change: 1.Class Person as final.
                //                         2.Variables that are declared as final.
                // In order to make them immutable such that their values cannot be altered.
 
		

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		public Person(Set<String> newPhoneNumbers,String fn,String ln) {
                // Here we need to:1.Make deep copy using parameterized constructor.
                //                 2.This makes the values that is being passed to this constructor as immutable.

                this.phoneNumbers=newPhoneNumbers;
                this.firstName=fn;
                this.lastName=ln;
 
               }
		public static void main(String args[])
		{
			Set<String> npm=new HashSet<String>();
			npm.add("9999999999");
			String fn="Reed";
			String ln="Elsevier";
			//npm.add("9000000000");
			//This cannot be done because: 1.The value is duplicate.
                        //                             2.It violates immutability.
			Person p=new Person(npm,fn,ln);
			System.out.println("NUM:"+p.getPhoneNumbers());
                        System.out.println("First:"+p.getFirstName());
                        System.out.println("Last:"+p.getLastName());
		}
	}
}
