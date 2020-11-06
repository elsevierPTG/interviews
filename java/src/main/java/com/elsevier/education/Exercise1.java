package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
/**
 * 
 * @author swapnilkulkarni 
 * email - kulswapnil@gmail.com
 * cell - 267 844 5443
 * recuiter - collabera
 * Made the class as final
 * set all variable as private & initialize them in constructor.
 * Remove the set methods for variables.
 * return collection as immutable.
 *
 */
public final class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person() {
			phoneNumbers = new HashSet<String>(Arrays.asList("267 844 5443", "234354"));
			firstName = "Swapnil";
			lastName = "Kulkarni";
		}

		public Collection<String> getPhoneNumbers() {
			return Collections.unmodifiableCollection(phoneNumbers);
		}
				
		public String getFirstName() {
			return firstName;
		}
				
		public String getLastName() {
			return lastName;
		}
		
	}
}
