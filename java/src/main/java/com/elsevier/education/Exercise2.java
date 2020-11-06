package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {
	/**
	 * Create an engine interface that standardizes methods
	 */
	interface Engine {
		public void spinWheels();
	}
	
	/**
	 * Now GasEngine implements the Engine interface
	 */
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * Here is the new ElectricEngine that also implements Engine
	 */
	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * Now instead of having a GasEngine field, we can have an Engine one
	 */
	public static class Car {
		
		private Engine engine;
		
		/**
		 * Now you pass in the engine type you would like to use
		 * 
		 * @param engine
		 * @return
		 */
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			// Since both engines implement the Engine interface, we know we can
			// call this method on either
			engine.spinWheels();
		}
	}
}