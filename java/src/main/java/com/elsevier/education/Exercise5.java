package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {

	public static class Singleton {

		private Singleton sing = new Singleton();

		private Singleton(){

		}

		public static Singleton getSing(){
			return sing;
		}

		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]){
		Singleton st = Singleton.getSing();
		st.doSomeThing();
	}
}
