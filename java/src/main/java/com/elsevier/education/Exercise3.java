package com.elsevier.education;

import java.util.*;

/**
 * 
 * Refactored to have overridden the hashcode and equals.
 * Hashcode will return the same value (derived from its field "id"). for everyobject , and equals will make sure to compare the correct values. 
 * (Hashcode and equals are generated with the help Eclipse Framework.)
 * 
 * @author Mukul Das 
 * Email: m.das001@yahoo.com
 * Recruiter: Collabera
 * 
 * 
 */

public class Exercise3 {
			public static class Person {
				
				
				private Integer id;
				
				public Person(int newId) {
					id = newId;
				}

				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + ((id == null) ? 0 : id.hashCode());
					return result;
				}

				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					Person other = (Person) obj;
					if (id == null) {
						if (other.id != null)
							return false;
					} else if (!id.equals(other.id))
						return false;
					return true;
				}
				
				
			}
}
