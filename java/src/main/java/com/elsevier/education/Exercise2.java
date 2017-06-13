package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		private final Engine engine;

		// Use constructor injection
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

	static class GasEngine implements Engine {
		@Override
		public void spinWheels() {
			// TODO: implement operation
		}
	}

	static class ElectricEngine implements Engine {
		@Override
		public void spinWheels() {
			// TODO: implement operation
		}
	}

	// Factory class provides methods for correct engine creation.
	static class Engines {
		public static Engine newGasEngine() {
			return new GasEngine();
		}

		public static Engine newElectricEngine() {
			return new ElectricEngine();
		}
	}
}