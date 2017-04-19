package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	/**
	 * Private constructor prevents using new operator on this class.
	 * 
	 * The only instance of this class is kept in the static final variable and initialized at declaration, 
	 * hence it is created right after class is loaded and before you can call any methods on it.
	 * 
	 * getInstance() is the only method to obtain the instance and it always returns the same one.
	 * 
	 * @author Alex
	 *
	 */
	public static class Singleton {
		
		private static final Singleton instance = new Singleton();
		
		private Singleton() {
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }

		public static Singleton getInstance() {
			return instance;
		}
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
