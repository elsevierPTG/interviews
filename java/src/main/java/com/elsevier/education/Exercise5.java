package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	/**
	 * Make Singleton to a true singleton.
	 * 1.) Create a private constructor so it cannot not be created outside the class.
	 * 2.) Add a static method called getInstance() to either create a Singleton object if no instance exists, or return the object if 
	 *  an instance already existed.
	 */
	private static class Singleton {
		private myObject Singleton;
		
		private Singleton() {
		}
		
		public static Singleton getInstance() {
			if (myObject == null)
				myObject = new Singleton();
			return myObject;
		}
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//Singleton st = new Singleton();
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
