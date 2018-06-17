package com.elsevier.education;

/**

 TODO refactor the Car to use dependency injection of the engine
 TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
 TODO make sure we have no-op implementations of the gas engine and electric engine
 <p>
 The class can have a interface Engine which can be implemented by GasEngine and Electric Engine.
 </p>
 */
public class Exercise2 {

	public static class Car {

		// Initialized this in constructor.
		private Engine engine;

		/**
		 * Constructor Injection for Engine
		 * @param engine
		 */
		public Car(Engine engine) {
			this.engine = engine;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}

	/**
	 * Gas Engine Implementation for Engine.
	 * @see com.elsevier.education.Exercise2.Engine
	 */
	public static class GasEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * Electric Engine Implementation for Engine.
	 * @see com.elsevier.education.Exercise2.Engine
	 */
	public static class ElectricEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}

	/**
	 * This is interface which has only one method.
	 */
	public static interface Engine{
		void spinWheels();
	}
}
