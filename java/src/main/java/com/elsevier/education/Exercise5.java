package com.elsevier.education;

/**

In order to support singleton functionality, I added the class variable to keep track of if 
it was already created. If it was not created, it would make a new singleton otherwise it would 
return the singleton that was already there. Since instantiation would hinder this, it is removed
from the main method and only accessible through itself and its subclasses.

*/
public class Exercise5 {

	public static class Singleton {
		private static Singleton instance = null;

		protected Singleton {}

		public static Singleton getInstance() {
			if (instance == null) {
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
		st.doSomeThing();
	}
}
