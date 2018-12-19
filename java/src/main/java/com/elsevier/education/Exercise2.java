package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {

		private Engine engine;

		public Car(Engine engine) {
			this.engine = engine;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}

	interface Engine {
		void spinWheels();
	}

	public static class GasEngine implements Engine {
		public void spinWheels() {
			System.out.println("Gas Engine spining the wheels");
		}
	}

	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			System.out.println("Electric Engine spining the wheels");
		}
	}

	// factory returns the object
	public static class SimpleCarFactory {
		
		
		public static Car getCar(String engineType) {
			return new Car(getEngine(engineType));
		}
		
		public static Engine getEngine(String engineType) {
			Engine engine = null;
			if ("gas".equals(engineType)) {
				engine = new GasEngine();
			} else if ("electric".equals(engineType)) {
				engine = new ElectricEngine();
			} else {
				new RuntimeException("only gas or electric engine supported");
			}
			return engine;
		}

	}


	public static void main(String[] args) {

		Car car1 = SimpleCarFactory.getCar("gas");
		car1.moveForward();

		Car car2 = SimpleCarFactory.getCar("electric");
		car2.moveForward();
		
		
	}

}