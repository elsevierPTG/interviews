package com.elsevier.education;

import static com.elsevier.education.Exercise5.Singleton.INSTANCE;

/**
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 *
 * The classic approach to this pattern would be to provide a static getInstance() method and either lazily
 * construct the singleton instance or statically create it upon load of the Singleton class. Care should be taken
 * in both cases to ensure thread safety.
 *
 * A better (recommended) way is to use an enumeration with a single value.
 *
 */
public class Exercise5 {
	
	public static enum Singleton {
		INSTANCE;
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.INSTANCE;
		st.doSomething();
	}
}
