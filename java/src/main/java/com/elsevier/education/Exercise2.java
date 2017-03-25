package com.elsevier.education;

public class Exercise2 {

	public static class Car {

		private Engine engine;

		/**
                 * Allowing for the injection of a generic
                 * Engine engine to the constructor
                 *
                 * @param engine   Either a gas or electring engine
                 * @return         An instance of a car
		 */
		public Car(Engine engine) {
			this.engine = engine;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}

	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine implements Engine {
		public void spinWheels() {
                        // no-op for now
                }
	}
}

/**
 * Creating engine interface with a contract obligating
 * classes to implement the method spinWheels
*/
public interface Engine {
	public void spinWheels();
}
