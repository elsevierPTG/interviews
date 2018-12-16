package com.elsevier.education;

public class Exercise5 {
	
	public static class Singleton {

		/**
		 * Class-level field that could be accessed by multiple threads concurrently
		 */
		private static volatile Singleton _instance = null;

		/**
		 * Create private constructor to prevent new operator being invoked on this class
		 */
		private Singleton() {
		}

		/**
		 * Performs lazy-instantiation of singleton instance to conserve resources. 
		 * Prevents multiple threads from simultaneously instantiating the class-level field.
		 * @return Singleton instance
		 */
		public static Singleton getInstance() {
	        if (_instance == null) {
                // Lock the entire class in JVM and allow only one thread into this block
	            synchronized(Singleton.class) {
	                if (_instance == null) {
	                    _instance = new Singleton();
	                }
	            }
	        }
	        return _instance;
	    }

		public void doSomeThing() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
