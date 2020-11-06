package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

 Moved to singleton enum pattern
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
