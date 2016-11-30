package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public final class Person {  // making the class as final to protect it from overridden by other class.
		
		private final Set<String> phoneNumbers; // making property as final so that can be initialized only once.
		private final String firstName;         // making property as final so that can be initialized only once.
		private final String lastName;          // making property as final so that can be initialized only once.
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
                     Set<String> temp = new HashSet<>(); // temp variable has created to perform deep copy rather than 
                                                         // shallow copy.                                           
                     temp = phoneNumbers;
                     this.phoneNumbers = temp;
                     this.firstName = firstName ;
                     this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		// removed the setter for phoneNumbers, not allowing to set from outside the class. 
		
		public String getFirstName() {
			return firstName;
		}
		// removed the setter for firstName, not allowing to set from outside the class.
		
		public String getLastName() {
			return lastName;
		}

                // removed the setter for firstName, not allowing to set from outside the class.
		
	}
}
