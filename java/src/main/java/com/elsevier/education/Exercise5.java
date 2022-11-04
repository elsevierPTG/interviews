package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton instance;

		// Private constructor to avoid explicit class creation
		private Singleton() {
		}

		public static Singleton getInstance() {
			// Lazy-initialization
			if (instance == null) {
				// Only if instance is null - use synchronized block. Read operation should not synchronized.
				synchronized (Singleton.class) {
					// Double check if instance is still null after entering synchronized block
					if (instance == null) {
						instance = new Singleton();
					}
				}
			}

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
