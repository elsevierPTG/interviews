package com.elsevier.education;

/*
 *  Singleton pattern is used to create only one instance of a class.
 * A single point of access has to be provided to the object.This is achieved by creating a static method getInstance().
 * If "Singleton" is an inner class then has to be in another class, it cannot be made as a Singleton,because a new instance of that 
 * class can be created in the same class.
 */
public class Exercise5 {
	
	public static void main(String args[]){
		Singleton s = Singleton.getInstance();
		s.doSomething();
	}

}
