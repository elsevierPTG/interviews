package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

Lavkesh:
 To make class as singleton, you need to make below changes.
 1. you need to make constructor private so no one is able to create class instance outside it.
 2. Define private static variable which is holding only instance of singleton class
 3. Define public static method which return single instance of class.

*/
public class Exercise5 {
	
	public static class Singleton {
		
		private Singleton(){
		}

		private static class SingletonHelperClass{
			private static volatile Singleton instance = new Singleton();
		}
		
		public static Singleton getInstance(){
			return SingletonHelperClass.instance;
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
