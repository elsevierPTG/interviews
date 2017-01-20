package com.elsevier.education;

/**
 * A singleton is that there is only 1 instance of the object.
 * So to this, reduce the visibility of the constructor from
 * public to private.  Add a static variable of the instance and
 * a getter of the single instance. 
*/
public class Exercise5 {
	
	public static class Singleton {
		
		private static final Singleton INSTANCE = new Singleton();
		
		private Singleton() {}
		
		public static Singleton getInstance() {
			return INSTANCE;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton.getInstance().doSomething();
	}
	
}