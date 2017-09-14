package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

 In that case we can do so simply by making the fields final and providing one public constructor.

 I _COULD_ have provided getters (not setters) but the additional dereferencing step annoys me.

 If the work environment prefers getters for immutable objects, then I would provide them.

*/
public class Person {

	public final Set<String> phoneNumbers;
	public final String firstName;
	public final String lastName;

	protected Person() {} //No one is allowed to use this.

	public Person(final Set<String> phoneNumbers,
				  final String firstName,
				  final String lastName) {

		this.phoneNumbers = phoneNumbers;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}