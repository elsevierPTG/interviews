package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	

	//Assuming that this class needs to be an inner class, there's no way to make it a 'true'
	//singleton, since the constructor can never be hidden from the parent class.
	public static class Singleton {
		
		private static Singleton instance;
		
		private Singleton() {
			
		}
		
		//This is a lazy instantiation to save memory.
		//It is marked 'final' so no subclass can turn this class into a non-singleton.
		//It is marked synchronzied so two threads cannot instantiate the class at the same
		//time.
		public static final synchronized Singleton getInstance() {
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
		
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();

		st.doSomeThing();
	}
}
