package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		/**
		 * Constructor will be made as private ,hence avoiding instance creation from outside
		 * getInstance ensures that only one instance is returned everytime.
		 */
		private static Singleton instance;
		
		private Singleton(){
		}
		public static Singleton getInstance(){
			 // double check locking to avoid creating multiple instance when multiple threads access this 
			  //method for the first time
			 if(instance == null){
                            synchronized (Singleton .class) {
                              if(instance == null){
                                    instance = new Singleton ();
                                   }
			    }     
                           }
                    return instance;  
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
