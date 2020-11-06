package com.elsevier.education;

import com.elsevier.education.AutomobileEngine;


/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	/**
	 * Implementation of a Car.
	 * <p>
	 * Uses dependency injection at the time of object construction
	 * to determine the Car's engine type.
	 */
	public static class Car {

		// class member varaibles
		private AutomobileEngine engine;

		/**
		 * Constructs and initializes a new Car.
		 *
		 * @param engine
		 *        The {@link AutomobileEngine} used by the car.
		 */
		public Car(AutomobileEngine engine) {
			this.engine = engine;
		}

		/**
		 * Moves the Car forward.
		 */
		public void moveForward() {
			engine.spinWheels();
		}
	}

	/**
	 * GasEngine implementation of the (@link AutomobileEngine}
	 * <p>
	 * Class maintained as inner class to maintain provided format and
	 * minimize class creation for ease of review
	 *
	 */
	public static class GasEngine implements AutomobileEngine {
		/**
		 * Spins the wheels of the vehicle powered by the gas engine.
		 * <p>
		 * (No-op implementation)
		 */
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * ElectricEngine implementation of the (@link AutomobileEngine}
	 * <p>
	 * Class maintained as inner class to maintain provided format and
	 * minimize class creation for ease of review
	 */
	public static class ElectricEngine implements AutomobileEngine {
		/**
		 * Spins the wheels of the vehicle powered by the gas engine.
		 * <p>
		 * (No-op implementation)
		 */
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}
}