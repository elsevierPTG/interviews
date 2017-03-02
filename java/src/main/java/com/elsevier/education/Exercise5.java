package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public  class Singleton { // A singleton class should not be static 
		private static Singleton singleton;
 		private Singleton(){  // Singleton should have a private constructor 
 		}
		public synchronized static Singleton getInstance() {
 		if(singleton == null){
 			singleton = new Singleton();
 		}
 			return singleton;
 		}
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance(); // getInstance() will look for an available instance , if not available it will create a new one .
		st.doSomeThing();
	}
}
