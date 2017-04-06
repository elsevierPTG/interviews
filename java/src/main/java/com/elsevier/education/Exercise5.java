package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
Singleton has to ensure that there is only one instance of a class is created.
*/
public class Exercise5 {
	
	public static class Singleton {
	
		private static Singleton uniqueInstance;

		private Singleton(){
		}
		/*
		the synchronized block is used inside the if condition with an additional check 
		to ensure that only one instance of singleton class is created.
		*/
		public static Singleton getInstance() {
			if (uniqueInstance == null) {
				if(uniqueInstance == null){
					synchronized (Singleton.class) {
						uniqueInstance = new Singleton();
					}
				}
			}
			return uniqueInstance;
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
