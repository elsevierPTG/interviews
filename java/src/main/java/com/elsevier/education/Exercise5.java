package com.elsevier.education;

/**
 * Turned the Singleton class into a typical singleton.
 */
public class Exercise5 {
	
	public static class Singleton {
		private static final Singleton instance = new Singleton();

		private Singleton() {}

		public static Singleton getInstance() {
			return instance;
		}

		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomething();
	}
}
