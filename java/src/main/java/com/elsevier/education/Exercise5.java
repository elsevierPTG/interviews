package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	private static SingleTon stObj;
	
	public static SingleTon getInstance(){
        if(stObj == null){
            stObj = new SingleTon();
        }
        return stObj;
    }

	public  class Singleton {
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
