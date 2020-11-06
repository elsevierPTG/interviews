package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
The way to create a singleton class is to make the constructor private and use a factory method to return an
 instance of a class created as a private static final reference to a new class instance. However, since the
 Singleton class is static in the question the private constructor can be called outside the class. This isn't
 normally a problem since client code lies doesn't invoke a static class' methods. Question design can be improved
*/
public class Exercise5 {

	public static class Singleton {
		private Singleton(){}
		private static final Singleton instance = new Singleton();
		public static Singleton getInstance(){return instance;}
		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]){
		Singleton.getInstance().doSomething();
	}
}
