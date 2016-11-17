package com.elsevier.education;

/**

TODO: Make this class immutable.



*/
public final class Exercise1 {
	//to create immutable; make sure class is final sothat it can not be extended or change
	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		//Default private constructor will ensure no unplanned construction or instantiation of class
		private Person(Set<String> phoneNumbers,String firstName,String lastName) {
			this.phoneNumbers=phoneNumbers;
			this.firstName=firstName;
			this.lastName=lastName;
		}
		
		
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		Set<String> immutable= new HashSet<String>();
		immutable.add("phoneNumbers");
		//ImmutableXXX.copyOf attempts to avoid copying the data 
		ImmutableSet<String> java = ImmutableSet.copyOf(immutable);
		
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}

	}
}
