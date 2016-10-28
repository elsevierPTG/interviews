package com.company;

/**
 * Created by Yash Gupta
 */
public class Exercise5 {

    private Exercise5(){}
    public static class Singleton {
        private static final Singleton SINGLETON_INSTANCE = new Singleton();
        private Singleton(){}
        public static Singleton getSingletonInstance(){
            return SINGLETON_INSTANCE;
        }
        public void doSomeThing() {
            System.out.println("Doing something....");
        }
    }

    public static void main(String a[]){
        Singleton.getSingletonInstance().doSomeThing();
    }
}
