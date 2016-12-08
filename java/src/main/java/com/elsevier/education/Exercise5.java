package com.elsevier.education;

/**
TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton singleton = null;
		
		private Singleton() {
			
		}
		
		public static Singleton getSingletonInstance(){
			if (singleton == null) {
				synchronized (Singleton.class) {
					if(singleton == null) {
						singleton = new Singleton();						
					}
				}
			}
			return singleton;
		}

		public void doSomeThing() {
			System.out.println("Doing something....");
	    }		
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getSingletonInstance();
		st.doSomeThing();
	}
}
