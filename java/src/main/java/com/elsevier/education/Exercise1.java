package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

Note: I wasn't sure whether you wanted Exercise1 to be immutable or the inner class Person 
to be immutable.  I chose both.  In doing so, I made final the Exercise1 and Person classes.

I also wasn't sure if you wanted the class to be immutable or an instance of the class
immutable so I made protected the setters so as to make an instance of the clas immutable 
but it could still be instantiated and set properly.

*/
public final class Exercise1
{
	public static final class Person
	{
		private Set<String> phoneNumbers;
		private String firstName;
		private String lastName;
		
		public Person()
		{ }
		
		public Person(final String sFirstName, final String sLastName, final Set<String> setPhoneNumbers)
		{
			setFirstName(sFirstName);
			setLastName(sLastName);
			setPhoneNumbers(setPhoneNumbers);
		}
		
		public String getFirstName()
		{
			return(firstName);
		}
		
		public String getLastName()
		{
			return(lastName);
		}
		
		public Set<String> getPhoneNumbers()
		{
			return(phoneNumbers);
		}
		
		protected void setFirstName(final String newName)
		{
			firstName = newName;
		}
		
		protected void setLastName(final String newName)
		{
			lastName = newName;
		}
		
		protected void setPhoneNumbers(final Set<String> newPhoneNumbers)
		{
			phoneNumbers = newPhoneNumbers;
		}
	}
}