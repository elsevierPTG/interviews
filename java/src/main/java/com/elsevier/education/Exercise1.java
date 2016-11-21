package com.elsevier.education;

public final class Exercise1 {

	public final static class Person {
		/*
		 * The class is changed to final,so that it cannot be extended.
		 * instance variables are changed to final.
		 * set methods are removed, so that values cannot be modified after the instance is created.
		 */
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers,String firstName,String lastName) {
			this.phoneNumbers=phoneNumbers;
			this.firstName=firstName;
			this.lastName=lastName;			
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
