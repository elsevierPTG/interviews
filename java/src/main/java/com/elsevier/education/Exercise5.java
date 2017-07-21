package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

Explanation : To create a truly singleton class we have to ensure that there is only one instance of that class in the container.
			  This singleton class can be generated using 
			  1. private static instance variable
			  2. private constructor
			  3. static & synchronized object creation method
			  
			  We have other means of creating Singleton as well (like using Enum), but have answered this question with only refactoring the provided sample class.

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton instance;
		
		private Singleton() {
			super();
		}
		
		public synchronized static Singleton getInstance() {
			if(instance != null) {
				instance = new Singleton();
			}
			
			return instance;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton singleton = Singleton.getInstance();
		
		singleton.doSomeThing();
	}
}
