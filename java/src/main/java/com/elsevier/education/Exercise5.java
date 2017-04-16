package com.elsevier.education;

/**
 * Moving the Singleton class from nested status to its own class to prevent
 * access to the private constructor from within wrapper class Exercise5
 */
public class Exercise5 {

	public static void main(String a[]) {
		Singleton st = Singleton.getInstance();
		st.doSomeThing("Doing something In Exercise 5....");
	}
}
