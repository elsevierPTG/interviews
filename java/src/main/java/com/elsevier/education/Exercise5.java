package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {

  public static enum Singleton {
    INSTANCE;
    public void doSomething() {
      System.out.println("Doing something....");
    }
  }

  public static void main(String a[]){
    Singleton.INSTANCE.doSomething();
  }
}
