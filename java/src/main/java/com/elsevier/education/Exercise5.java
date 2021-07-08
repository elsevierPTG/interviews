package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

 A number of different ways to accomplish this but a common pattern since Java 5 is to use an enum since Java ensures that
 only a single instance of each field can exist.

*/
public class Exercise5 {
	
	public enum Singleton {
		INSTANCE;

		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.INSTANCE;
		st.doSomething();
	}
}
