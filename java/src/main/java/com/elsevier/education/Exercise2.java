package com.elsevier.education;

/**

  Created Engine interface with default noop moethod.
  Added constructor that takes an Engineobject.
  If we need a default constructor for any reason, we can add that, along with a setEngine method.

*/
public class Exercise2 {

  public static class Car {

    private final Engine engine;

    public Car(final Engine engine) {
      this.engine = engine;
    }

    public void moveForward() {
      engine.spinWheels();
    }

    // Static factory methods for convenience
    public static Car withElectricEngine() {
      return new Car( new ElectricEngine() );
    }
    public static Car withGasEngine() {
      return new Car( new GasEngine() );
    }
  }

  public static class GasEngine implements Engine { }
  public static class ElectricEngine implements Engine { }

  /**
   * Engine interface with default no-op method
   */
  public static interface Engine {
    // no-op
    default public void spinWheels() { }
  }
}
