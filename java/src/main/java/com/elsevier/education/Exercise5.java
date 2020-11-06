package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
//Set instance with static modifier, since static class and value is loaded on jvm only one time.
//Singleton object is initialized only one time.
//Added getInstance() method to return the same instance of Singleton.
//Added  private Singleton constructor so Singleton cannot be initialized by using constructor.
//.
public class Exercise5 {

	public static class Singleton {
	    private static Singleton instance = new Singleton();
	    private Singleton(){
	    }
	    public static Singleton getInstance(){
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
