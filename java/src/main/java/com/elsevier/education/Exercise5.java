package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
Note: casing is different on "doSomething" in the Singleton class and the main method, as given in the source code.
*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton instance;

		// prevents instantiation
		private Singleton() {
		}

		static Singleton getInstance() {
			if(instance == null) {
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
