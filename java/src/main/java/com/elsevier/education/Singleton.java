package com.elsevier.education;

public class Singleton {
	
	private Singleton() {}
	
	private static final Singleton INSTANCE = new Singleton();
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	public void doSomething() {
		System.out.println("Doing something....");
    }
}
