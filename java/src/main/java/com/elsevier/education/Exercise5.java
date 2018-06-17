package com.elsevier.education;

/**

 TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 <p>
 Using ENUM implementation for Singleton specified in Effective Java to restrict.
 ENUM singleton solves serialization issue as it is inherently serializable.
 Reflection issue is also not there.
 It is lazy initialized as well.
 </p>
 */
public class Exercise5 {

	/**
	 * This is ENUM way of implementing Singleton.
	 */
	public enum  Singleton {
		SINGLETON;
		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]){
		Singleton st = Singleton.SINGLETON;
		st.doSomething();
	}
}
