package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

 Created a static method that will always return a single instance of the Singleton class.

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton instance = null;

		private Singleton(){}
		public static Singleton get(){
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
		Singleton st = Singleton.get();
		st.doSomething();
	}
}
