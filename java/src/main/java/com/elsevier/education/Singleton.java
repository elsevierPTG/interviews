package com.elsevier.education;

public final class Singleton {
  private static Singleton singleton;
  private Singleton(){
  }

  public static Singleton instance(){
    if(singleton==null){
      singleton = new Singleton();
    }
    return singleton;
  }

  public void doSomething() {
    System.out.println("Doing something....");
  }
}