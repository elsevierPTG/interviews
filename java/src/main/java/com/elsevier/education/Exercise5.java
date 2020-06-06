package com.elsevier.education;

/**

DONE: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

FIX - standard singleton treatment:
- make constructor private so that it cannot be called except by class methods
- have a static private member, which will be the sole instance (singleton)
- create a single accessor method for gatekeeping control of that singleton object, creating if necessary

*/
public class Exercise5 {
	
	public static class Singleton {
	
		static private Singleton mSingleton = null;
		
		private Singleton() {}
		
		public static Singleton getSingleton() {
			if( mSingleton == null ) {
				mSingleton = new Singleton();
			}
			return mSingleton;
		}
	
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//Singleton st = new Singleton();
		Singleton st = Singleton.getSingleton();
		st.doSomething();
	}
}
