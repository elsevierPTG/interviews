package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

 [aziring]  To make the Singleton class a singleton, make the constructor private, create a static
 instance object of Singleton, and create a static public getInstance object that instantiates a new
 object if instance is null, otherwise return the current instance object.

*/
public class Exercise5 {
	
	public static class Singleton {

		private static Singleton instance = null;

		private Singleton() {

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
		st.doSomeThing();
	}
}
