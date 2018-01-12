package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

Answer:

Rather then calling new, you should call a 'getInstance()' method.
The 'new' functionality also has to be blocked, by tightening the constructor access

*/
public class Exercise5 {
	
	public static class Singleton {
		//will be created first time any calling class calls Singleton.getInstance()
		private static Singleton justTheOneSingleton = new Singleton();
		//if the above could create an exception, you could do in a static block with try/catch
		
		//don't allow use of 'new Singleton()' in calling code
		private Singleton(){	
			//any work needed for initialization
		}
		
		public static Singleton getInstance(){
			return justTheOneSingleton;
		}
		
		//the instance of our Singleton, justTheOneSingleton, that gets passed to the calling code
		//will still have access to this method
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
