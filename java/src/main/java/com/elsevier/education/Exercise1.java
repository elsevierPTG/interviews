package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName, String lastName, Set<String> pN) {
			this.firstName = firstName;
			this.lastName = lastName;
			Set<String> tempSet =new HashSet<String>();
		        Iterator<String> it = pN.iterator();
		        while(it.hasNext()){
			   tempSet.add(it.next());
		        }
		       this.phoneNumbers=tempSet;
		}

		public Set<String> getPhoneNumbers() {
			return (Set<String>) phoneNumbers.clone();
		}
				
		public String getFirstName() {
			return firstName;
		}
				
		public String getLastName() {
			return lastName;
		}
		
	}
}
