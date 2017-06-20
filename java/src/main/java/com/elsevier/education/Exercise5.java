package com.elsevier.education;


/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

 In order to make this class an actual singleton, it needs a private constructor in addition to a method
 to allocate an instance of the singleton, which is public. There a number of ways to convert a class into a
 singleton. Here I create a final Singleton called INSTANCE which will be initialized once when the class is
 first created when getInstance() is referred to. I added another call to getInstance as well as a println after each
 invocation to show that the same physical instance of Singleton is being referenced,
*/
public class Exercise5 {
	
	public static class Singleton {

		private static final Singleton INSTANCE = new Singleton();

		private Singleton() {}

		public static Singleton getInstance() {
		    return INSTANCE;
        }

		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		System.out.println(st);
		st.doSomething();
		Singleton nst = Singleton.getInstance();
        System.out.println(nst);
		nst.doSomething();
	}
}