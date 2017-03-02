package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		// By default Singleton is initialized to null
		private static Singleton singleton;

		//Constructor is made private to prevent any other class from instantiating.
		private Singleton(){
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
		
		/*
		 This method will create and returns Singleton instance only if singleton is null else it will return 
		 the old instance which was already created
		 */
		public synchronized static Singleton getInstance() {
			//create new instance only if singleton is null
			if(singleton == null){
				singleton = new Singleton();
			}
			return singleton;
		}
	}
		
	public static void main(String a[]){
		//Singleton.getInstance() is used to get the Singleton instances
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
