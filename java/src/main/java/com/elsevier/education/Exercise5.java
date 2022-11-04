package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/

// Implemented Singleton functionality within getInstance() method, which checks to see if Singleton object
// is already created.

public class Exercise5 {
	
	public static class Singleton {
		private static Singleton instance = null;
		
		protected Singleton() {
		}
		
		public static Singleton getInstance() {
			if (instance == null) {
				instance = new Singleton();
			}
				return instance;
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
