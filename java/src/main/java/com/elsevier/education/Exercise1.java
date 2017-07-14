package com.elsevier.education;

import java.util.Set;
	/** The Purpose of this class is to Make this class immutable.
	 * The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
	 * The class is final so we cannot create the subclass.
	 * There is no setter methods i.e. we have no option to change the value of the instance variable.
	*/
	
		public final class Person{
			
			private final Set<String> phoneNumbers;
			private final String firstName;
			private final String lastName;
			
			
			public Person(Set<String> newPhoneNumbers,String newFirstName,String newLastName) {
				phoneNumbers = newPhoneNumbers;
				firstName = newFirstName;
				lastName = newLastName;
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
