package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

  /**
   * A simple class for representing a car. The car can have any type of engine as long as it
   * implements the {@link Engine} interface.
   */
  public static class Car {

    /** The engine for the car. */
    private Engine engine;

    /**
     * Constructor for a Car. NOTE: Injection of an engine into the constructor allows for use of
     * various types of engines.
     *
     * @param engine the engine to use for the Car
     */
    public Car(Engine engine) {
      this.engine = engine;
    }

    /**
     * Move the car forward.
     */
    public void moveForward() {
      engine.spinWheels();
    }
  }

  /**
   * An interface for an engine. NOTE: An abstract class could also be used here if it is determined
   * that there is some default behavior desired for an engine (although interfaces in Java 8 also
   * allow for default methods) or if we want an Engine to have some state.
   */
  public static interface Engine {
    /**
     * Cause the engine to spin the car wheels.
     */
    public void spinWheels();
  }

  /**
   * An implementation of an Engine that will be powered by gas.
   */
  public static class GasEngine implements Engine {
    @Override
    public void spinWheels() {
      // no-op for now
    }
  }

  /**
   * An implementation of an Engine that will be powered by electric.
   */
  public static class ElectricEngine implements Engine {
    @Override
    public void spinWheels() {
      // no-op for now
    }
  }
}
