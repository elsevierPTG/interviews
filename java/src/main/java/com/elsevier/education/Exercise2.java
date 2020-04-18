package com.elsevier.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	@Component
	public static class Car {

		/**
		 * Autowired engine injecting GasEngine object.
		 * 
		 * The Qualifier can be changed to use also the electric implementation.
		 */
		@Autowired
		@Qualifier("GasEngine")
		private Engine engine;
		
		public Car() {
		}

		/**
		 * engine variable will have an instance of GasEngine class.
		 */
		public void moveForward() {
			engine.spinWheels();
		}
	}

	/**
	 * Gas engine implementation with a qualifier to identify the type of object we want to inject.
	 *
	 */
	@Component
	@Qualifier("GasEngine")
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * Electric engine implementation with a qualifier to identify the type of object we want to inject.
	 *
	 */
	@Component
	@Qualifier("ElectricEngine")
	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * Abstraction is made to create either an electric or gas implementation.
	 */ 
	interface Engine {
		public void spinWheels();
	}
}