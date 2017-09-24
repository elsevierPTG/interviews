package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {

	/**
	 * Singleton class.
	 */
	public static class Singleton {
		// class member varaibles
		private static final Singleton singleton = new Singleton();

		/**
		 * Private constructor to encourage consumers to use the getSingleton() method to
		 * obtain a reference to the Singleton
		 */
		private Singleton() {}

		/**
		 * The approved way to get a reference to the Singleton object
		 *
		 * @return
		 *      Singleton, a reference to the only instance of itself
		 */
		public static Singleton getSingleton() {
			return singleton;
		}

		/**
		 * Does something
		 */
		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	/*
	 * Appliction main method
	 */
	public static void main(String a[]){
		// get a reference to the Singleton
		Singleton st = Singleton.getSingleton();
		// do something
		st.doSomething();
	}
}
