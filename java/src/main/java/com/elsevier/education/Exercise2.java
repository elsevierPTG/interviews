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

	public static class Car {

		private Engine engine = null;

		public Car() {
		}

		// Method to inject Engine into Car
		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		public void moveForward() {
			if (engine != null) {
				engine.spinWheels();
			}
		}
		
		abstract class Engine {

			public abstract void spinWheels();

		}

		class GasEngine extends Engine {

			public void spinWheels() {
				System.out.println("GasEngine is spinning wheels...");
			}

		}

		class ElectricEngine extends Engine {

			public void spinWheels() {
				System.out.println("ElectricEngine is spinning wheels...");
			}

		}

	}

	public static void main(String[] args) {
		
		Car car = new Car();
		
		Car.Engine engine = car.new GasEngine();
		//Car.Engine engine = car.new ElectricEngine();
		
		car.setEngine(engine);
		
		car.moveForward();
	}

}