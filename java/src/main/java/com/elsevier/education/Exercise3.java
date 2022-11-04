package com.elsevier.education;

public class Exercise3 {

	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			final int prime = 31;
		    int result = 1;
		    result = prime * result + ((id == null) ? 0 : id.hashCode());
		    return result;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}