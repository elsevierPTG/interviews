package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	private static SingleTon singleTon;
    	 
    	 private SingleTon(){	          
    	  }
    
      	public static SingleTon getInstance(){
            if(singleTon == null){
                singleTon = new SingleTon();
            }
            return singleTon;
    	}
	
	public static class Singleton {
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}
