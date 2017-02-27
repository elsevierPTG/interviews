package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {
 
	public interface Engine {
		default void spinWheels() {
			// no-op for now
		}

	}

public static class GasEngine implements Engine {}
 
public static class ElectricEngine implements Engine {}

public static class Car {

	private final Engine engine;
	public Car(Engine engine) {
		this.engine = engine;
	}
  
	public void moveForward() {
  		engine.spinWheels();
	}

}

 
public static void main(String[] args) {
	/*Gas engine object */
	Car gasEngineObj= new Car(new GasEngine());
	gasEngineObj.moveForward();
 	/*electric car engine object */
	Car electricEngineObj= new Car(new ElectricEngine());
	electricEngineObj.moveForward();
  }
 }
