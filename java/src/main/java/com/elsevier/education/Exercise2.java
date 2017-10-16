package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

 [aziring]  see comments below

*/
public class Exercise2 {

	public static class Car {

		/**
		 * [aziring]  The actual reference that is injected depends on the framework being used.
		 */
		@Inject
		private Engine engine;

		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	/**
	 * [aziring] Interface for all Vehicle implementations with Engines to use
	 */
	public interface Engine() {
		public void spinWheels();
	}

	/**
	 * [aziring] GasEngine now implements the Engine interface, with an implementation of spinWheels
	 */
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * [aziring]
	 * A new Implementation of Engine called ElectricEngine also needs to implement spinWheels
	 * so if the new Engine instance that is injected in the Car class is of type ElectricEngine,
	 * it will all also successfully execute a spinWheels action.
	 */
	public static ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op
		}
	}
}