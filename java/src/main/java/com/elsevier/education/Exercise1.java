package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 {

	public final static class Person {
		
		final private Set<String> phoneNumbers;
		final private String firstName;
		final private String lastName;
		
		public Person() {
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
		/**
	 * Constructor performing Deep Copy
	 * @param fName
	 * @param lName
	 * @param pNumbers
	 */
	
	public FinalClassExample(String fName, String lName, HashMap<String> pNumbers){
		System.out.println("Performing Deep Copy for Object initialization");
		this.firstName=fName;
		this.lastName=lName;
		HashMap<String> pNumbersMap =new HashMap<String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			pNumbersMap.put(hm.get(key));
		}
		this.testMap=pNumbersMap;
	}
	
	}
}
