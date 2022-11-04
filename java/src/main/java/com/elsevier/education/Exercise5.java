package com.elsevier.education;


public class Exercise5 {
	
	public static class Singleton {

		private static Singleton self = null;

		public void doSomething() {
			System.out.println("Doing something....");
	    }
		/* we need to create an instance inside the class itself,
			then be sure this instance will be execute once by checking its value
		 */
	    public static Singleton init(){
			if(self == null) {
				self = new Singleton();
			}
			return self;
		}
	}
		
	public static void main(String a[]){
		/* to call singleton class, we don't need new word,

		 */
		Singleton st = Singleton.init();
		st.doSomething();
	}
}
