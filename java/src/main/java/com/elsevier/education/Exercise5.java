package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
/**
 * 
 * @author Rohini Byrishetty
 * Implemented the Singleton with getinstance method
 *
 */
public class Exercise5 {
	
	public static class Singleton {
		private final Singleton single_instance;

		private single_instance(){
			
		}

		public Singleton getInstance() {
			if (single_instance == null) {
				single_instance = new Singleton();
			}
			return single_instance;
		}

		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]) {
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}


