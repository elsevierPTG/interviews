package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static final Singleton instance = new Singleton();	//creat class instance	
		//added private constructor
		private Singleton(){
			
		}
		public void doSomething() {
			System.out.println("Doing something....");
	    	}
		public static Singleton getInstance(){//added method to get single instance
			
			return instance;
		
		}
		
	public static void main(String a[]){
		//Singleton st = new Singleton();
		Singleton st=Singleton.getInstance();//call class method here to get class instance
		st.doSomeThing();
		
		
	}
}
