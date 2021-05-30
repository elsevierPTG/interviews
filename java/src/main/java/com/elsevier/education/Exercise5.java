package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {

		private static Singleton instance;

		private Singleton() {}

		/**
		 * @return the single instance of the class.
		 */
		public static synchronized Singleton getInstance() {
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}

		private void doSomething() {
			System.out.println("Doing something....");
	    }
	}

	public static void main(String a[]){
		Singleton.getInstance().doSomething();
	}
}
