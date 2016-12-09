package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	/**
	 * Changing the car constructor to get engine via DI
	 * Providing a generic engine interface to allow any engine injected (gas, electric or any other in future)
	 */
	public static class Car {
		
		private Engine engine;

		public Car(Engine engine) {
			this.engine = engine;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public interface Engine {
		 void spinWheels();
	}
}