package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	//Making final so it cannot be inherited
	// if it were top level class I would not have used static for the class definition
	    public static final class Singleton {
			// Making constructor private so it cannot be initialized by other classes
			
			private Singleton(){
			}
			
			// Inner class to create the instance
			// Lazy loading - Only create the instance when needed
			// Thread safe - since class initialization is guaranteed by JLS to be serial. 
			//Also because of the above reason we do not need to make it Synchronized explicitly
			private static class SingletonInstance{
				private static final Singleton instance = new Singleton();
				
			}
			
			// single entry point for accessing Singleton instance
			public static Singleton getInstance(){
				return SingletonInstance.instance;
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
