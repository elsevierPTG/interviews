package com.elsevier.education;

/**

@author Todd Goglia 8/22/2017
Created a private default constructor and a static getInstance method to make the Singleton class into an actual singleton. Updated
the main method to use the getInstance() method.

*/
public class Exercise5 {
	
	public static class Singleton {
		
		private static Singleton singletonInstance = new Singleton();
		private Singleton(){
			
		}
		
		public static Singleton getInstance(){
			return singletonInstance;
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
