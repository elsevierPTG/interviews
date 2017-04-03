package com.elsevier.education;


import java.util.Set;
import java.util.TreeSet;

/**
TODO: Make this class immutable.
*/
/**
 * Do not provide setter methods to all the properties in class. Setter methods are meant to change the state of object and this is what we want to prevent here.
 * Make all the fields private , so that no other classes can access from outside and make them final .
 * We should not allow subclasses to override ,to achieve this make the class as final.
 * @author Safura
 *
 */
public class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> tempPhoneNumbers) {
			this.firstName = firstName;
			this.lastName = lastName;
			Set<String> tempSet = new TreeSet<>(tempPhoneNumbers);
			phoneNumbers = tempSet;
		}

		public Set<String> getPhoneNumbers() {
			return (Set<String>) ((TreeSet<String>)phoneNumbers).clone();
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		
		/**
		 * Commented setters to prevent the value modification from outside
		 */
		
		/*public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		public void setFirstName(String newName) {
			firstName = newName;
		}
		public void setLastName(String newName) {
			lastName = newName;
		}*/
	}
}