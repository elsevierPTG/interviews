package com.elsevier.education;

import static java.lang.System.out;

public class Exercise5 {

	public static void main(String...inputs){
		Singleton singleton = Singleton.getInstance();
		singleton.doSomething();
		Singleton anotherSingleton = Singleton.getInstance();
		out.println((singleton == anotherSingleton) ? "Same object" : "different object");
	}

	public static class Singleton {
		
		private Singleton() {}
		
		private static Singleton singleton = null;
	
		public static Singleton getInstance() {
			if (singleton == null)
				singleton = new Singleton();
			return singleton;
		}
			
		public void doSomething() {
			out.println("doSomething method called");
		}
	}
}
