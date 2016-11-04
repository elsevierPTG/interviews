package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

Singlton class now has private constructor and can only be instantiated using getInstance method.
once static instance is created, any more calls on getInstance method would return the same static instance.
Since the getInstance is synchronized it can stay singleton even in multithreaded app.

*/
public class Exercise5 {
	
	public static class Singleton {
		
		private static Singleton static_instance;
		
		private Singleton(){
			
		}
		
		public static synchronized Singleton getInstance(){
			if (static_instance == null) {
				static_instance = new Singleton();
			}
			return static_instance;
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
