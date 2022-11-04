package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

 Normally, this would be done using a dependency injection framework like Spring or Guice.

 But you can implement this using the common <pre>getInstance()</pre> paradigm.

 There's also many variations of this pattern, including a lazy version (where race conditions are harder to avoid)

*/
public class Exercise5 {
	
	public static class Singleton {
		private static final Singleton instance = new Singleton();
		
		private Singleton() {

		}

		public void doSomething() {
			System.out.println("Doing something....");
	    }

	    public static Singleton getInstance() {
			return instance;
		}

	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
