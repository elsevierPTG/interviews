package com.elsevier.education;

/**
 * This is a thread safe and performant implementation of the singleton pattern.
 * Normal synchronized singleton implementations run a static synchronized
 * method to check if the private instance is null. This is slow for a heavily
 * used singleton. The double-checked locking avoids this performance overhead.
 * The class is final to stop any extension and reconstruction.
 * 
 * @author Pradeep Prabhakar
 */

public final class Singleton {

	private static Singleton singletonInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singletonInstance == null) {
			synchronized (Singleton.class) {
				if (singletonInstance == null) {
					singletonInstance = new Singleton();
				}
			}
		}
		return singletonInstance;
	}

	public void doSomeThing(String printString) {
		System.out.println(printString);
	}
}
