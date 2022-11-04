package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {

	public static class Singleton {
        private static Singleton instance = null;

        protected Singleton(){
            // Exists to defeat instantiation
        }

        // If we don't have an instance, create one. Return the instance
        public static Singleton getInstance() {
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }

		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}

	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomething();
	}
}
