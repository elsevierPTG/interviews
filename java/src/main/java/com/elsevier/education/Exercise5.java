package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/

/**
 * Created the singleton class
 */
public class Exercise5 {
	
	public static class Singleton {

		private static Singleton singleton;
		private Singleton(){

		}

		public static void getInstance(){
			if(singleton == null) {
				singleton = new Singleton();
			}
		}
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomething();
	}
}
