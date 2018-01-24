package com.elsevier.education;

/**
 * 
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 * 
 * ah, the much maligned singleton pattern. i don't really understand the bad rap this pattern gets, as it's certainly useful when done correctly.
 * for instance, the android ecosystem/framework does a very good job of leveraging the singleton pattern.
 * perhaps its because this pattern is often poorly implemented that people tend to shy away from it.
 * i often see it implemented by still using the constructor to create the initial static instance, which is really bad practice.
 * if this singleton needed some sort of initialization parameters then i would either leverage spring context directly 
 * or create an init method that took the parameters and created the static instance.
 */
public class Exercise5 {
	
	public static class Singleton {
		
		private static Singleton instance = new Singleton();
		
		// this should never be called outside of this class and making the constructor explicit and private should enforce this compile time
		private Singleton(){}
		
		private static Singleton getInstance(){
			return instance;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
		}
	}
		
	public static void main(String a[]){
		Singleton.getInstance().doSomething();
	}
}
