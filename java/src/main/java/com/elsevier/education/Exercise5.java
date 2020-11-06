package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
/**
 * 1. Constructor should be private constructor. This way no other object can be created outside of this class.
 * 2. Create public method "getInstance" which returns the same instance
 * 3. Make the method "synchronized", this way it is thread-safe.
 *
 */
public class Exercise5 {

	public static class Singleton {

		private static Singleton myObj;
		/**
		 * Create private constructor
		 */
		private Singleton(){

		}
		/**
		 * Create a static method to get instance.
		 */
		public static synchronized Singleton getInstance(){
			if(myObj == null){
				myObj = new Singleton();
			}
			return myObj;
		}

		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
