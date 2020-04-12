package com.elsevier.education;

/**

*/
public class Exercise5 {
	
	public static class Singleton {
		
		/*
		 * To make Singleton a singleton class, a private static reference to a single instance
		 * was created.  This instance will be initialized the first time getInstance is called
		 * and will not be replaced unless the reference to singleton_instance is nullified.
		 */
		private static Singleton singleton_instance;
		
		/*
		 * A call to getInstance was added to make sure an instance of the singleton class is created.
		 * Not necessary in this exercise, but it is possible for another class to call doSomething() without
		 * a Singleton instance being initialized first.  This will avoid the method running without an instance
		 * active.
		 */
		public void doSomething() {
			getInstance();
			System.out.println("Doing something....");
	    }
		
		/*
		 * Constructor is private to be sure no other class initializes an instance of Singleton
		 */
		
		private Singleton() {}
		
		/*
		 * All other classes requiring a reference to the singleton class will use this method,
		 * it ensures that only a single instance of Singleton exists.
		 */
		public static Singleton getInstance() {
			if (singleton_instance == null) {
				singleton_instance = new Singleton();
			}
			return singleton_instance;		
		}
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
