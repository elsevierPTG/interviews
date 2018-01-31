package com.elsevier.education;

/**
 * An example Singleton using an enum to enforce the singleton
 * 
 * from Effective Java, Item 3 - Enforce the singleton property with a private
 * constructor or an enum type
 * 
 * @author todd weber
 *
 */
public class Exercise5 {

	public enum Singleton {
		INSTANCE;

		/** 
		 * perform the singleton action
		 */
		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]) {
		Singleton.INSTANCE.doSomething();
	}
}
