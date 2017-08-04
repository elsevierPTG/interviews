package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		@AutoWired
		private GasEngine engine;


		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	/**
	 * Created the interface  engine for abstaction and have a method spinWheels
	 */
	public interface Engine {
		public void spinWheels();
	}

	/**
	 * Gas engine inherited from Engine
	 */
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * Electric engine inherited from Engine interface
	 */
	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

}