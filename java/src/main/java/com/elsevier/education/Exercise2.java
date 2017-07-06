package com.elsevier.education;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

/**
 * Weld implementation for dependency injection Gas engine set as the default
 * engine implementation with the Electric engine as the alternate.
 * 
 * Default implementation of Engine's spinWheels method permits implementing
 * classes use of the default method
 *  
 *  @author todd weber
 */
public class Exercise2 {

	public static class Car {

		private @Inject Engine engine;

		public Car() {
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}

	public static interface Engine {
		default public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * Gas Engine implementation
	 */
	@Default
	public static class GasEngine implements Engine {
	}

	/**
	 * Gas Engine implementation
	 */
	@Alternative
	public static class ElectricEngine implements Engine {
	}

}