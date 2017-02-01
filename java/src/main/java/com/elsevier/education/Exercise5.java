package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

I turn to constructor to be private and I add a getInstance method. This lazy loads the instance instead of always
 creating the object when the class is loaded.
*/
public class Exercise5 {
	
	public static class Singleton {

		private static Singleton instance;

		private Singleton() {
			// do nothing this is here to prevent instantiation
		}

		public static Singleton getInstance() {
			if (instance == null)
				instance = new Singleton();

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
