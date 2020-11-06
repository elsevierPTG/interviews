package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

	To Make this immutable do not allow the subclass to override methods, also make the fields final and private
	Mutable fields should not be allowed to change
	Init fields in the constructor itself

*/
public final class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> phoneNumbers,String firstName,String lastName) {
			// I am assuming the user is limited to a HashSet.
			
			this.phoneNumbers=new HashSet<>(phoneNumbers);
			this.firstName=firstName;
			this.lastName=lastName;
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
		public static void main(String... args) {
				Set<String> phoneNumbers = new HashSet<>();
				phoneNumbers.add("484-111-2222");
				phoneNumbers.add("484-222-3333");
				System.out.println(phoneNumbers);
				Person p1 = new Exercise1.Person(phoneNumbers, "John", "Smith");
				System.out.println(p1.getPhoneNumbers());
				p1.getPhoneNumbers().add("555-555-5555");
				phoneNumbers.add("444-444-4444");
				System.out.println(p1.getPhoneNumbers());
		}
	}
}