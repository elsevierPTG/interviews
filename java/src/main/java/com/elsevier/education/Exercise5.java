package com.elsevier.education;

/**
 TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 */
public class Exercise5 {

    public static class Singleton {
        // Private static variable of the Singleton class that is the only instance of the class.
        private static Singleton instance;

        //private constructor to avoid client applications to use constructor
        private Singleton(){
        }

        public void doSomeThing() {
            System.out.println("Doing something....");
        }

        //Public static method that returns the instance of the class, this is the global access point
        //for outer world to get the instance of the Singleton class.
        public static Singleton getInstance(){
            if (instance == null)
            {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public static void main(String a[]){
        Singleton.getInstance().doSomeThing();
    }
}