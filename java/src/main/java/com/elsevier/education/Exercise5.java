package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		// Single static final instance of Singleton
		private static final Singleton SINGLETON = new Singleton();
		
		// Singleton constructors are private so that new cannot be called
		Singleton() {
			// Singleton
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
		
		// Method to get reference to Singleton
		public static final Singleton get() {
			return SINGLETON;
		}
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.get();
		st.doSomething();
	}
}
