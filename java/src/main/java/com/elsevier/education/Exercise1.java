package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
/**1)declared class Person as final2)Removed setters3)made all fields final & private4)Made constructor private will ensure no unplanned construction of class5)factory method to store object creation at single place
*/
public  class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		
		private Person(Set<String phoneNumbers,String fisrtName,String lastName>){
			this.phoneNumbers=phoneNumbers;
			this.firstName=fisrtName;
			this.lastName=lastName;
		}
		public static Person createNewInstance(Set<String> phoneNos,String firstNm,String lastNm){
			return new Person(phoneNos,fisrtNm,lastNm);
		}
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
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
