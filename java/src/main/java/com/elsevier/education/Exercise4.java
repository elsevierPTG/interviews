package com.elsevier.education;

/*
 * The class Counter is not synchronized as its variable count can be changed from the methods in the class.
 * To make it Thread safe , create a final 'countLock' Object to restrict same Object to operate through different Thread.
 * The Object has to be checked in synchronized block in the methods.
 * On a given instance only one Thread will be able to access it.
 */
public class Exercise4 {
	
	public static class Counter {
		private  int count=0;
		private final Object countLock = new Object();
		public  int increment(){
			synchronized (countLock) {
				return ++count;
			}
			
		}
		
		public int getCount(){
			synchronized (countLock) {
			return count;
			}
			
		}
		
		public void resetCount(){
			synchronized (countLock) {
			count = 0;
			}
		}
	}
}
