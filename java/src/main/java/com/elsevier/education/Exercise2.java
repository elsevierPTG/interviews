package com.elsevier.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**

TODO refactor the Car to use dependency injection of the engine 
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

Not sure what you mean by no-op implementations.

*/
public class Exercise2 {

  public static class Car {
    
    @Autowired(required = true)
    @Qualifier("GasEngine")
    private Engine engine;
        
    public Car() {
    }
    
    public void moveForward() {
      engine.spinWheels();
    }
  }
  
  public static class GasEngine implements Engine {
    
    public static final String SERVICE_NAME = "GasEngine";
    
    @Override
    public void spinWheels() {
      // no-op for now
    }

  }
  
public static class ElectricEngine implements Engine {
  public static final String SERVICE_NAME = "ElectricEngine";
  
    @Override
    public void spinWheels() {
      // no-op for now
    }

  }
  
  public static interface Engine {
    void spinWheels();
  }
  
}
