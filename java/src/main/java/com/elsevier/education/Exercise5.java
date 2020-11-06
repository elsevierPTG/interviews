package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

 I chose this implementation because it is simple and thread safe,
 while still using lazy instantiation. By making INSTANCE static and
 declaring and initializing it in the same line, we ensure that it will be
 created the first time it is accessed, and that it can be accessed without
 first instantiating Singleton. We make INSTANCE final as well so that it
 cannot be changed. The Singleton constructor is made private to make sure
 that accessing INSTANCE is the only pathway to instantiating Singleton.
*/
public class Exercise5 {
	
	public static class Singleton {
		public final static Singleton INSTANCE = new Singleton();
		private Singleton(){}
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.INSTANCE;
		st.doSomething();
	}
}
