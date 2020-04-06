package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/

/**
 * Checking to see if an instance already exists, and if so, just return it
 */
public class Exercise5 {

	public static class Singleton {

		private static Singleton instance = null;

		public void doSomething() {
			System.out.println("Doing something....");
		}

		public static Singleton getInstance() {
			if(instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
	}

	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
