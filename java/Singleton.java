package com.elsevier.education;

/*
 * Singleton pattern is used to create only one instance of a class.
 * A single point of access has to be provided to the object.This is achieved by creating a static method getInstance().
 * If "Singleton" is an inner class then has to be in another class, it cannot be made as a Singleton,because a new instance of that 
 * class can be created in the same class.
 */
public class Singleton {
		
	private static  Singleton instance = null;
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		
		return instance;
	}
	private Singleton(){
		
	}
	
	public void doSomething(){
		System.out.println("Doing Something");
	}

}

