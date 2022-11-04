package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	public static class Singleton {
		/**
		 * This is where the real sigleton will live
		 */
		private static Singleton instance = null;

		protected Singleton() {
			// Only needs to override default access of 'public' to 'private'
		}

		/**
		 * Here is where we will get the sigleton
		 * 
		 * @return
		 */
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
		// Now we can't call the constructor directly, we have to use getInstance
		Singleton st = Singleton.getInstance();

		// This method did not match the one defined above: `doSomething` vs `doSomeThing`
		st.doSomething();
	}
}
