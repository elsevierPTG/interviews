package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public class Singleton { // Removing static class, because the scope is applicable to object not the class
		private Singleton instance = null;
		
		private Singleton(){ // creating private constructor to avoid creating objects outside
		}
		public Singleton static getInstance(){ // defining public static method to get the instance of Singleton class
			if(instance == null){
				return new Singleton(); 
			}
		}
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//Singleton st = new Singleton();
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
