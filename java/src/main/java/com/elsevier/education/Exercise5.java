package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 * Although not commonly used, the best and most bullet proof way to make a class a Singleton is via
 * Java ENUM's. That's because via serialization, a clever hacker or careless programmer can manage
 * to create a second instance of your "Singleton". Therefore I've used ENUM approach below.

*/
public class Exercise5 {
	
	public enum Singleton {
		INSTANCE;
		public static void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton.INSTANCE.doSomething();
	}
}
