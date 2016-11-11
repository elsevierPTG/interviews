package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		//singleton needs a final instance of itself
		private static final Singleton singleton = new Singleton();
		
		//Singleton needs a private constructor to ensure other classes can not instantiate it
		private Singleton() {
			//constructor
		}
		
		//singleton needs a public static getter method so the instance can be retrieved
		public static Singleton getSingleton() {
			return singleton;
		}
		
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//we use the getter method, since it cannot be instantiated
		Singleton st = Singleton.getSingleton();
		st.doSomeThing();
	}
}
