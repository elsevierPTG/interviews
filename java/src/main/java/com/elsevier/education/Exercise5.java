package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	
	public static class Singleton {
		// Private constructor is added so that instance cannot be created from other public class
		private Singleton instance;
		private Singleton(){
		}
		// getInstance method is added to check if instance already exists. If instance is not available, new instance is 
		// created. Else existing instance will be returned
		public static Singleton getInstance(){
			if(instance == null){
				instance = new Singleton();
			}
			return instance;
				
		}
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		// getInstance() is called to get unique instance.
		//Singleton st = new Singleton();
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
