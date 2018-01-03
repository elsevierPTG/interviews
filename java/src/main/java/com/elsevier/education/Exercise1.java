package com.elsevier.education;

import java.util.Set;

/**
 * 
 * This class is made mutable by malking it final, intialization by constructor only and removing the setters.
 * 
 * @author Mukul Das 
 * Email: m.das001@yahoo.com
 * Recruiter: Collabera
 * 
 * 
 */
public final class Exercise1 {
		public static final  class Person {
				
				private final Set<String> phoneNumbers;
				private final String firstName;
				private final String lastName;
				
				public Person(Set<String> newPhoneNumbers,String newFirstName, String newLastName) {
					this.phoneNumbers = newPhoneNumbers;
					this.firstName = newFirstName;
					this.lastName = newLastName;
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
