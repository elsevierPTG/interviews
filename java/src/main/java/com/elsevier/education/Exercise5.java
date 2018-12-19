package com.elsevier.education;

/**
 * 
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method
 * should still call .doSomething().
 * 
 */
public class Exercise5 {

	final public static class Singleton {
		 // eager initialization
//		private static Singleton singleton = new Singleton();
//		public static Singleton getInstance() {
//			return singleton;
//		}

		// lazy initialization instance creation 
		private static Singleton singleton;

		private Singleton() {
			System.out.println("instance created.");
		}


		
		public static Singleton getInstance() {

			if (singleton == null) {
				// do not use synchronized at method level for performance reason
				synchronized (Singleton.class) { 
					if (singleton == null) {
						singleton = new Singleton();
					}
				}
			}
			return singleton;
		}

		public void doSomeThing() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String args[]) {
		
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
