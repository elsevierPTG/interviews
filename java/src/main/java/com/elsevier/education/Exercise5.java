package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	 
	public static class Singleton {
		 // create static final object so that the created object do not change 
		private static final Singleton singleton;
		//we need private constructor for denying direct access from outside
		private Singleton()
		{
		}
		// create public static method to check if instance already exists , if instance does not exist
		// new instance will be created, else existing will be returned 
		public static Singleton getInstance()
		{
			if(singleton==null)
			{
				singleton=new Singleton();
			}
			return singleton;
		}
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//getInstance() is called instead of new singleton, to get unique instance
		Singleton st=Singleton.getInstance();
		st.doSomeThing();
	}
}
