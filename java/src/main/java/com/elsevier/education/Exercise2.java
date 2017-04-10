package com.elsevier.education;

/**
TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine
*/
public class Exercise2 {
	// Interface for engine
	public interface Engine {
		public void spinWheels();
	}

	public static class Car {		
		private Engine engine;
		
		public Car() {
		}

		// Assigns engine based on the engine instance we pass to the method
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			this.engine.spinWheels();
		}
	}
	
	// Class implements Engine Interface
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	// Class implements Engine Interface
	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
}