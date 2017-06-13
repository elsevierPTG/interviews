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

	static class DefaultEngine implements Engine {
		@Override
		public void spinWheels() {
			// default implementation
		}
	}

	static class GasEngine implements Engine {
		private final Engine defaultEngine;

		// Private constructor to avoid explicit engine creation
		private GasEngine(Engine defaultEngine) {
			this.defaultEngine = defaultEngine;
		}

		public void spinWheels() {
			// delegate spin wheels to the default implementation
			defaultEngine.spinWheels();
		}
	}

	static class ElectricEngine implements Engine {
		private final Engine defaultEngine;

		// Private constructor to avoid explicit engine creation
		private ElectricEngine(Engine defaultEngine) {
			this.defaultEngine = defaultEngine;
		}

		@Override
		public void spinWheels() {
			// delegate spin wheels to the default implementation
			defaultEngine.spinWheels();
		}
	}

	// Factory class provides methods for correct engine creation.
	static class Engines {
		private static final Engine defaultEngine = new DefaultEngine();

		public static Engine newGasEngine() {
			return new GasEngine(defaultEngine);
		}

		public static Engine newElectricEngine() {
			return new ElectricEngine(defaultEngine);
		}
	}
}