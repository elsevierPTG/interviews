package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

Chris Wolf <cw10025@gmail.com>, recruiter Emma Peterson <epeterse@teksystems.com>
*/
public class Exercise5 {
	
	public static class Singleton {
	    private static Singleton instance;
	    private Singleton() {}
	    
	    public static Singleton instance() {
	        synchronized(Singleton.class) {
	            if (instance == null)
	                instance = new Singleton();
	            return instance;
	        }
	    }
	    
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton.instance().doSomething();
	}
}
