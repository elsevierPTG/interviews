package com.elsevier.education;

/**
 * Created a Singleton class for Exercise 5
 */
public class Singleton {
    private static Singleton singletonInst = null;
    public void doSomething() {
        System.out.println("Doing something....");
    }
    private Singleton(){ System.out.println("constructor called"); }
    public static Singleton getInstance() {
        if (singletonInst == null){
            singletonInst = new Singleton();
        }
        return singletonInst;
    }
}