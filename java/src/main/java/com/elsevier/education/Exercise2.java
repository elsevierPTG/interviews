package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	/**
	 * The contract for a Car engine.
	 *
	 * @see ElectricEngine
	 * @see GasEngine
	 */
	public static interface Engine {
		void spinWheels();
	}

	public static class Car {
		
		private final Engine engine;

		public Car(final Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
}