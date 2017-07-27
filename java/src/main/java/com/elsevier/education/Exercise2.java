package com.elsevier.education;

/**

 TODO refactor the Car to use dependency injection of the engine
 TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
 TODO make sure we have no-op implementations of the gas engine and electric engine

 */
public class Exercise2 {

	public static class Car {

		private Engine engine;

		/*
		Constructor Dependency as a car cannot exist without engine.
		 */
		public Car(Engine engine) {
			this.engine = engine;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}

	/*
	This is an abstract class which shall be extended.
	 */
	public static abstract class Engine{
		public abstract void spinWheels();
	}

	public static class GasEngine extends Engine{
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine extends Engine{
		public void spinWheels() {
			// no-op for now
		}
	}

	public static void main(String[] args) {

		Engine gasEngine = new GasEngine();
		Car gasCar = new Car(gasEngine);

		Engine electricEngine = new ElectricEngine();
		Car electricCar = new Car(electricEngine);
	}
}
