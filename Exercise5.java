package com.elsevier.education;

/**
TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
*/

/**
 * Singeltom class created by adding private constructor and having to ability to get an instance of the new instantiation of the class
 *
 * @author Karen Rainsford
 * @date   16-Mar-2017
 */

public class Exercise5 {
	
	public class Singleton {

		private static Singleton sObj;
		/*
		 * create private constructor
		 */
		private Singleton() {

		}
		/*
		 * create method to get instance of Singleton object
		 */
		public static Singleton getInstance() {
			if (sObj == null) {
				sObj = new Singleton();
			}
			return sObj;
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
