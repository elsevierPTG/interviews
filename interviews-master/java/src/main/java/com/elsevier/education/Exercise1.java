package com.elsevier.education;

import java.util.Set;

/**

Make this class immutable.

 Steps:
 	1) remove field Setters (commented here for past reference)
    2) provide a constructor for setting
    3) remove default constructor
    4) make class final
*/
public final class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

        //Remove default constructor to abe able to make fields final, and get one chance to initialize using the
        // following constructor
//		public Person() {
//		}

        /**
         * Constructor performing Shallow Copy
         * @param firstName
         * @param lastName
         * @param phoneNumbers
         */
		public Person(String firstName,String lastName,Set<String> phoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumbers = phoneNumbers;
		}


		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
//		public void setPhoneNumbers(Set<String> newPhoneNumbers) {
//			phoneNumbers = newPhoneNumbers;
//		}
		
		public String getFirstName() {
			return firstName;
		}
//		public void setFirstName(String newName) {
//			firstName = newName;
//		}
//
		public String getLastName() {
			return lastName;
		}
//		public void setLastName(String newName) {
//			lastName = newName;
//		}
	}
}