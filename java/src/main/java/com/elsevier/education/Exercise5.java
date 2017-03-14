package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public class Singleton {
		private static Singleton singleton;
		//Private constructor to control object creation from other class
		private Singleton() {
		}
		
		public synchronized static Singleton getInstance() {
			//check for null
			if (singleton == null) {
				//if null creates a  new instance
				singleton = new Singleton();
			}
			//if not null returns the old object
			return singleton;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//getInstatbnce is ussed to get the singleton instance
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
