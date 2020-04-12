package com.elsevier.education;

/**
 * 
 * TODO refactor the Car to use dependency injection of the engine TODO allow
 * use of either a gas engine or electric engine (create an appropriate
 * abstraction) TODO make sure we have no-op implementations of the gas engine
 * and electric engine
 * 
 */
public class Exercise2 {
	/*
	 * Abstract class to define parent Engine class passed to Car during
	 * construction
	 */
	public static abstract class Engine {
		/*
		 * Abstract method spinWheels implemented by subclasses
		 */
		abstract void spinWheels();
	}

	public static class Car {

		private Engine engine;

		/*
		 * Parameter engine is now passed during construction. This allows dependency
		 * injection
		 */
		public Car(Engine engine) {
			setEngine(engine);
		}

		public void setEngine(Engine e) {
			engine = e;
		}

		/*
		 * Since Car is a static class, Car.moveForward() can be called
		 * before Car is instantiated, so we have to check to make sure engine
		 * is not null.
		 */
		public void moveForward() {
			if (engine != null) {
				engine.spinWheels();
			}
		}
	}

	public static class GasEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine extends Engine {
		public void spinWheels() {
			// no-op
		}
	}
}