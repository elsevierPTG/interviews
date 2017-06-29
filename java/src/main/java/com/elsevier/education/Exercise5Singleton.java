package com.elsevier.education;

public class Exercise5Singleton {

    private  Exercise5Singleton(){

    }

    private static Exercise5Singleton singleton = new Exercise5Singleton();


    public static Exercise5Singleton getInstance(){
        return singleton;
    }


    public void doSomeThing() {
        System.out.println("Doing something....");
    }
}
