package com.elsevier.education;


/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static volatile Singleton instance;
		private Singleton(){
			//creating the private constructor
		}
		/**
		 * Factory method to return singleton 
		 * @return
		 */
		public static Singleton getSingletonInstance(){
			if(null == instance){
				synchronized (Singleton.class) {
					//double locking -- checking the object for null again before sending back
					if(null == instance)
						instance = new Singleton();
				}
			}
			return instance;
		}
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//need to access the object using the factory method 
		//used for returning the singleton object
		Singleton st = Singleton.getSingletonInstance();
		st.doSomeThing();
	}
}
