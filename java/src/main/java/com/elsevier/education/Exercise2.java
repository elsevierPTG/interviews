package com.elsevier.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

public class Exercise2 {
	public static class Car {
		
		/**
		 * Automatically wire the engine using type (Interface Engine).
		 * Use a qualifier because there may be multiple classes implementing that interface. 
		 */
		@Autowired
		@Qualifier("gasEngine")
		private Engine engine;
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	/**
	 * Declare interface for all engines. This allows us to depend on an interface instead of a class. 
	 */
	public static interface Engine {
		void spinWheels();
	}

	/**
	 * Gas engine implements Engine interface.
	 * Assign unique name to this implementation. Change qualifier to electricEngine if you want to use a different engine. 
	 */
	@Component
	@Qualifier("gasEngine")
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * Electric Engine also implements Engine interface.
	 * Assign unique name to this implementation.
	 * @author frafi
	 *
	 */
	@Component
	@Qualifier("electricEngine")
	public static class EletricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
}