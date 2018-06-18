package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		/**
		 * An static and private object of the class is declared
		 */
		private static Singleton singleton;
		
		/**
		 * This method will return the same object always because it's validating the static object before being returned. 
		 * If it's null it will create an instance and return it, 
		 * if it's not null, it will return the already instantiated object.
		 * @return
		 */
		public static Singleton getInstance() {
			if(singleton==null) {
				singleton = new Singleton();
			}
			return singleton;
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
