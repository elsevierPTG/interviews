package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private Singleton(){
	         //private constructor
	    }
		private static Singleton singleton; 
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
		
		public static Singleton getInstance() {
			if(singleton == null) {
				singleton = new Singleton(); 
			}
			return singleton;
		}
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomething();
	}
}
