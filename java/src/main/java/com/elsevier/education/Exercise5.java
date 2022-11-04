package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
1- Making a static property which will return same type instance.
2- private constructor so that instation of object will hapen only once
3- double checking for mutiple thread access.



*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton obj;
		
		// private constructor to force use of getInstance() to create Singleton object
    		private Singleton() {}
		
		public static Singleton getInstance()
   		 {
        	if (obj == null){
            // To make thread safe
            synchronized (Singleton.class){
                // check again as multiple threads can reach above step
                if (obj==null)
                    obj = new Singleton();
		    }
       			 }
        	return obj;
   		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		
		//Singleton st = new Singleton();
		
		/*Instead of direct instation we will call the getInstance and if the there will be no instance it will provide a new one 
		or else if instance is available it would it use the reference of it*/
		
		Singleton st =  Singleton.getInstance();
		st.doSomeThing();
	}
}
