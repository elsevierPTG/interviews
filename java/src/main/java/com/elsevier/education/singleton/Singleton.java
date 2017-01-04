package com.elsevier.education.singleton;

public class Singleton {
    protected Singleton() {
        // make default constructor protected
    }
    // this is a simple singleton.  lazy instantiation 
    // that's thread safe would take a lot more thought
    private static Singleton theirSingleton = new Singleton();
    
    public static final Singleton newInstance() {
        return theirSingleton;
    }
    public void doSomeThing() {
        System.out.println("Doing something....");
    }
}
