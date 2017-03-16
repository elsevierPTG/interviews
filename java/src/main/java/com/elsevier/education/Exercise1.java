package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {
	//Making the class final so that this class may not be inherited by any other class.
	public static final class Person {
		//Making all the parameters final so that their values cannot  be modified after initialization
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		//Providing the parameters for the initialization when the object is created for the first time .
		public Person(String firstName,String lastName, Set<String> phoneNumbers) {
			this.firstName =firstName;
			this.lastName =lastName;
			this.phoneNumbers =phoneNumbers;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		//Commenting the setter methods so that the parameters are not accessible by the other classes.
		/*public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}*/
		
		public String getFirstName() {
			return firstName;
		}
		/*public void setFirstName(String newName) {
			firstName = newName;
		}*/
		
		public String getLastName() {
			return lastName;
		}
		/*public void setLastName(String newName) {
			lastName = newName;
		}*/
	}
}
