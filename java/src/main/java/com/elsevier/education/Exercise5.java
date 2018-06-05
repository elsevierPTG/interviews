package com.elsevier.education;

/**
 * Using a popular and "almost" standard way of creating the singleton.
 * Many times, have seen double check versions but prefer this because it's cleaner
 * and the nested static class will only be loaded upon need and only once.
*/
public class Exercise5 {
	
	public static class Singleton {
		// Keep other classes external to Exercise 5 from accessing Singleton constructor;
		// not sure if author meant for a test driver to be created or not,
		// as Exercise5 can access the private constructor as the outer class.
		private Singleton() {};
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
		
		private static class SingletonHelper {
			// Final makes it initialized only once.
			private static final Singleton INSTANCE = new Singleton();
		}
		
		public static Singleton getInstance() {
			// Only loaded on-demand.
			return SingletonHelper.INSTANCE;
		}
	}
		
	public static void main(String a[]){
		// Change getting reference of singleton to how it would be called from external classes.
		// Singleton st = new Singleton();
		Singleton st = Singleton.getInstance();
		
		// There was a camel case typo in the following method call: st.doSomeThing().
		st.doSomething();
	}
}
