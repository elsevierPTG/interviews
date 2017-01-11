package com.elsevier.education;

/**
TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton singletonObj= new Singleton();
		/**
		 Prevents instantiating the class
		 */
		private Singleton() { }

		   /* Static 'instance' method */
		   public static Singleton getInstance( ) {
			   return singletonObj;
		   }
		protected void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
