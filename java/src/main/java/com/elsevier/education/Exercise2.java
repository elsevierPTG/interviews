package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		// Change the explicit implementation to a interface field
		private final Engine engine;

		// Pass whichever type of engine into the class
		public Car(Engine engine) {
			this.engine = engine;
		}

		// Call the interface's method which will call the impl
		public void moveForward() {
			engine.spinWheels();
		}
	}

	// Create an interface to allow multiple engine impls
	public interface Engine {
		void spinWheels();
	}

	// Gas engine impl
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no op
		}
	}

	// Electric engine impl
	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no op
		}
	}
}