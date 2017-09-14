package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

 Pretty positive I provided the textbook answer to this question. Maybe there's a more clever one to impress the arcane test reviewer.

*/
public class Exercise5 {
	
	public class Singleton {
		private static final Singleton INSTANCE;

		private Singleton() {}

		public static Singleton getInstance() {
			if(INSTANCE == null) {
				INSTANCE = new Singleton();
			} //I suppose I'll allow myself this sinful imperative if statement. Let me atone for my sins.

			return INSTANCE;
		}

		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
