package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {

	    // To make sure others do not create object.
	    private Singleton(){}


	    // This inner class shall help creating object.
        private static class SingletonHelper{
            private static final Singleton singleton = new Singleton();
        }

		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}

	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}
