package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
Here use two approaches, one is static inner class, the other is enum.

*/
public class Exercise5 {
	
	// When the instance is loaded into memory and then initialized immediately, so it is thread-safe.
	// And it is lazy loading because the instance will not be initialzied until getInstance() is called.
	public static class Singleton {
		private static class SingletonHolder {
			private static final Singleton INSTANCE = new Singleton();
		}
		private Singleton() {}
		
		public static final Singleton getIntance() {
			return SingletonHolder.INSTANCE;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
	
	/*
	This method is much more simple and thread-safe.
	public enum Singleton {
		INSTANCE;
	}
	
	*/
		
	public static void main(String a[]){
		Singleton st = Singleton.getIntance();
		st.doSomeThing();
	}
}
