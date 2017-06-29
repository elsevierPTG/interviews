package com.elsevier.education;

import java.util.Set;
import java.util.TreeSet;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

    /**
     * declare the class as a final so it cannot be extended.
     * removed all the setters.
     * preformed  a deep copy  on the Set object so if the
     * call object would create a reference it would not change
     * made all fields final
     */

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> pNumbers, String fName, String lName ) {
			this.firstName = fName;
			this.lastName = lName;

			Set<String> temp = new TreeSet<>();

			for (String value: pNumbers){
			    temp.add(value);
            }

            this.phoneNumbers = temp;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers ;
		}
		
		public String getFirstName() {
			return firstName;
		}

		
		public String getLastName() {
			return lastName;
		}

	}
}