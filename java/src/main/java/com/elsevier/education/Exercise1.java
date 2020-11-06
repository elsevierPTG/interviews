package com.elsevier.education;

import java.util.Set;




/**
 Name:  Paul Chang Yong Kim<br> 
 Email: ksense1210@gmail.<!-- -->com<br> 
 Recruiter: Emma Peterson at TekSystems<br> 
 
TODO: Make this class immutable

*/

public class Exercise1 {
	/**

	 * First, declare the class final by adding final keyword<br>
	 * Second, declare all instance fields private final<br>
	 * Third, remove all setter methods<br>
	 * Lastly, Modify constructor to set the fields upon instantiation<br>
	 * Reason: The reason for adding private and final keywords to class and field names is because<br>
	 * 			we don't want to let anything change the state of the instance hence, we would need to add<br>
	 * 			final keyword for all fields to be immutable. Another reason why we had to remove setter methods<br>
	 * 			was because the setter methods allows the class instance to be changed.<br>

	 */
	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		//public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			//this.phoneNumbers = newPhoneNumbers;
		//}

		public String getFirstName() {
			return firstName;
		}

		//public void setFirstName(String newName) {
			//firstName = newName;
		//}

		public String getLastName() {
			return lastName;
		}

		//public void setLastName(String newName) {
			//lastName = newName;
		//}
	}
}