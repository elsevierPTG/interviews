package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		// Creating Singleton using eager instantiation.
		private static Singleton singleton = new Singleton();
		private Singleton() {
		}
		
		private static Singleton getInstance() {
                     return singleton;
              	}
              
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		// getting instance using getIsntance method.
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
