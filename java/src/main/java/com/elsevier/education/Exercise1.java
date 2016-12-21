package com.elsevier.education;
import java.util.Set;
/**

TODO: Make this class immutable.
We accomplish this as follows:
 - Make the class final
 - Make all member variables final, since they are already private
 - Remove setter methods
 - Modify constructor to accept arguments to initialize member variables
*/
public class Exercise1 {

	// Make it final
	final public static class Person {
		// Make all members private
		final private Set<String> phoneNumbers;
		final private String firstName;
		final private String lastName;
		
		// Modifiy constructor to accept parameters to initialize member variables
		public Person(Set<String> mPhoneNumbers, String mFirstName, String mLastName) {
			// initialize fields
			this.phoneNumbers = mPhoneNumbers;
			this.firstName = mFirstName;
			this.lastName = mLastName;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	}
}
