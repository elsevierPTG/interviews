package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static class Person {
		/**  we need to take final variable because final variable nothing but constantvalue  */
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final  String lastName;
		
		public Person() {
		}

		/**  take the one argumented constructor to set values  */
		public Person(set<String> phoneNumbers,String firstName,String lastName) {
			
			this.firstName=firstName;
			this.lastName=lastName;
			this.phoneNumbers=phoneNumbers;
			
		}
		/**  No need to write the setters methods because we can not modify the values for fina variable  */
		
	
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		//public void setPhoneNumbers(Set<String> newPhoneNumbers) {
		//	phoneNumbers = newPhoneNumbers;
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
		//	lastName = newName;
		//}
	}
}
