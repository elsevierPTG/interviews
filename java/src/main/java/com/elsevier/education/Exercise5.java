package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {

	private Singleton() //private constructor
		public void doSomething() {
			System.out.println("Doing something....");

	 
	
	    }
	}
		
	public static void main(String a[]){
		//Singleton st = new Singleton(); No need for this
		private static final Singleton singleobject = new Singleton();
		singleobject.doSomeThing();
	}
}
