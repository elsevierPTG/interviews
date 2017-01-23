package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	/** create static final object to not change the created object **/
	private static final Singleton singleton = new Singleton();
		
	/** create private constructor for denying direct access from outside**/
	private Singleton(){
		/** throw exception in private constructor to avoid multiple creation using reflection**/
		if(singleton != null){
			throw new IllegalStateException("instance already created.");
		}
	 }
	
	/** create static method to get the instance created**/
	public static Singleton getInstance(){
		return singleton;
	}
	public static class Singleton {
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}
