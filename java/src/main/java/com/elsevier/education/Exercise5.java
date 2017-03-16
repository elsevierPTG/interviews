package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		public static Singleton singleton ;
		//Making the constructor private so that the other classes cannot access it directly. 
		private Singleton(){
		}
		public void doSomething() {
			System.out.println("Doing something....");
	    }
		//Created a method to get the instance of the singleton class .
		public Singleton getInstance(){
			if(singleton != null){
				singleton = new Singleton();
				return singleton();
			}
		}
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
