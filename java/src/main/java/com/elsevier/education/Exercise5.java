package com.elsevier.education;

/**
TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
*/
public class Exercise5 {
	
	public static class Singleton 
    {
		// Variable stores singleton object
		private static Singleton singleton = new Singleton();

		// Constructor declared as private to make the class singleton
        private Singleton() {

        }

		public static void doSomething() {
			System.out.println("Doing something....");
	    }

		// Returns the singleton instance
        public static Singleton getInstance() {
            return singleton;
        }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}