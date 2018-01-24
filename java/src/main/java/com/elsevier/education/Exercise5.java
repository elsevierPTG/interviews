package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	
	/**
	 * 1.<!-- --> Add a new instance variable of the class itself so that the class has only one instance<br>
	 * 2.<!-- --> Create a new method that returns the current instance of itself, if none exists (will always be the first time),
	 * 	  create a new instance<br>
	 * 3.<!-- --> Instantiate the singleton class by the method created
	 * 
	 */
	
	public static class Singleton {
		  // static variable instance of type Singleton.
	    private static Singleton instance = null;

		
		public static Singleton getInstance() {
			if (instance == null) {
				instance = new Singleton();
			}
			
			return instance;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
