package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
    /**
     * Made constructor private so nobody can create an instance.
     * Created and stored an instance in a class level variable. This will be the only instance.
     * Provided getInstance() so anybody can access that instance.
     */
	
	public static class Singleton {
	    private static final Singleton instance = new Singleton();
		private Singleton() {
		}

        public static Singleton getInstance() {
            return instance;
        }

        public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
