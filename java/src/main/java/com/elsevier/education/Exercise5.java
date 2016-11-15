package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public final static class Singleton {
		private static final Singleton INSTANCEOBJECT = new Singleton();
		//define this method as static so that this can be access outside the class.	
		public static Singleton getInstanceObject() {
			return INSTANCEOBJECT;
		}
		//make the constructor private so that this class object is not created outside the class.
		private Singleton() {
		//Constructor logic goes here.
		}

		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//call the static method getInstanceObject() using the classname as it is static.
		//This returns the object of Singleton class. Using this object call doSomeThing() method.
		Singleton.getInstanceObject().doSomeThing();
	}
}
