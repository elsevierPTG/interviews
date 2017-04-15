package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

 In order to make this class an actuaal singleton, it needs a provate constructor in addition to a method
 to allocate an instance of the singleton.

*/
public class Exercise5 {
	
	public static class Singleton {

		private static final Singleton singletonObj = new Singleton();

		private Singleton() {}
/*
		public static Singleton getInstance() {

			if (singletonObj == null) {
				singletonObj = new Singleton();
			}

			return singletonObj;
		}
*/
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomething();
		st = new Singleton();
		st.doSomething();
	}
}
