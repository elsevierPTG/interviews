package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 { // declaring as final make the class not to extend by any other class.
	
	// defining constructor for outer class, so that it can be accessed from outside
	public Exercise1(Set<String> phoneNumbers,String firstName, String lastName){ 
		Person(phoneNumbers,firstName,lastName);// as Person class is static, call it directly.
	}

	private static class Person { //changing access modifier to private,because t will be accessed through Exercise1
		
		private Set<String> phoneNumbers;
		private  String firstName;
		private  String lastName;
		
		 // changing access modifier to default, since it should be accessed only through 'Exercise1'
		Person(Set<String> phoneNumber,String firstNam, String lastNam) {
			phoneNumbers = phoneNumbe;
			firstName = firstNam;
			lastName = lastNam;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		//commentting setter, since the values are being set in constructor
		/*public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		} */
		
		public String getFirstName() {
			return firstName;
		}
		//commentting setter, since the values are being set in constructor
		/* public void setFirstName(String newName) {
			firstName = newName;
		}*/
		
		public String getLastName() {
			return lastName;
		}
		//commentting setter, since the values are being set in constructor
		/*public void setLastName(String newName) {
			lastName = newName;
		}*/
	}
}
