package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	/**
	 * Make this class final, declare a static initialization of this class,
	 * make its no-arg constructor private, and implement a `getInstance` method
	 * 
	 * @author Rai Singh
	 * 
	 * Recruiter: Linda Pham, Jobspring Partners
	 *
	 */
	public final static class Singleton {
		
		private static final Singleton INSTANCE = new Singleton();
		
		private Singleton() {
			
		}
		public static Singleton getInstance() {
			return INSTANCE;
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
