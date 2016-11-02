package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {

	public static class Singleton {

		private static Singleton instance;

		private Singleton() {
 		}


 		//This is the lazy initialization of the Singleton instance
 		public static final synchronized Singleton getInstance() {
  			if (instance == null) {
  				instance = new Singleton();
  			}
  			return instance;
 		}

		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}

	public static void main(String a[]){

		//Create the object through the actual Singleton way
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
