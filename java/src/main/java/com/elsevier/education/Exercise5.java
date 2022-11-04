package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

-- singleton: private constructor, getInstance to return instance... clonning and serializable marker interfaces
are taken care of 
-- I personally like eagarly loaded singleton, no need for thread safty unless object creation is complex/heavy
-- eagerly loaded = instance created as its declared


*/
public class Exercise5 {
	
	public static class Singleton {
		
		private static Singleton instance = new Singleton();
		
		//I won't like to synchronize this method as synchronization is bit costly
		// I avoided it by eagaerly creating the instance.
		public static Singleton getInstance() {
			return instance;
		}
		
		private Singleton() {
			//constructor is private - no new operations
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
		
		//cloning not supported throw exception 
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
