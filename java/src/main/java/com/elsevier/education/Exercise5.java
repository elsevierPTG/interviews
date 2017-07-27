package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton instance = new Singleton();
		
		private Singleton() {
			// private constructor to prevent creation of instance outside of Singleton
		}
		
		public static Singleton getInstance() {
			return instance;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//Singleton	s1 = new Singleton();
		//s1.doSomething();
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
