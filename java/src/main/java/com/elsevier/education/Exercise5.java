package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {

	public class Singleton {

		private static Singleton testSingleton;

		/**
		 * privatize
 		 */
		private Singleton(){}

		/**
		 * There can only be one
		 *
		 * @return Singleton the one and only instance
		 */
		public static Singleton getInstance(){
			if (testSingleton == null)
				testSingleton = new Singleton();

			return testSingleton;
		}

		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//modify this to call getInstance instead of new Singleton()
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
