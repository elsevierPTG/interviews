package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	/**
	 * We use constructor dependency injection. When an instance of Car is
	 * created, it must be provided with some or any kind of Engine (Gas or Electric).
	 *<p>
	 * This allows for loose-coupling: Car is not dependent on a specific Engine
	 * implementation. Instead it is more flexible because it can be provided with any kind of Engine type.
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

	/**
	 * Defined Engine interface that acts as a common abstract type for GasEngine
	 * and ElectricEngine.
	 *<p>
	 * Both types of engine implement the interface.
	 */
	public static interface Engine {
		void spinWheels();
	}

	public static class GasEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}
}