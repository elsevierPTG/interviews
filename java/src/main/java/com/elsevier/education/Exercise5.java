package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
*/

/**
 * Static block will be called the first time where the instance is created and assigned.
 * The instance object can ge used to call doSomething
 */
public class Exercise5 {
	
	public static class Singleton {
		public static Singleton instance;

		static {
			instance = new Singleton();
		}

		public void doSomething() {
			System.out.println("Doing something...." );
	    }
	}
		
	public static void main(String a[]){
		Singleton.instance.doSomething();
	}
}
