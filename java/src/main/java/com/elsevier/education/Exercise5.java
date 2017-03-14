package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		//Added private static variable to avilable only in this class and hold the instance
		private static Singleton instance = new Singleton();
		//Added a private constructor to restrict instantiation from other classes
		private Singleton(){
			if(instance != null){
				throw new IllegalStateException("Object already created");
			}
		}
		//Added a public static method to get the instance from other classes
		public static Singleton getInstance(){
			return instance;
		}			
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//Accessing the method using the Class name
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
