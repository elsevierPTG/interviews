package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;

		//@Autowired
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	/**
	 * We need an interface so we can refer to either a GasEngine or an ElectricEngine class
	 */
	public interface Engine {

		public void spinWheels();
	}

	public static class GasEngine implements Engine {

		@Override
		public void spinWheels() {
			System.out.println("Wrooom!");
		}

	}

	public static class ElectricEngine implements Engine {

		@Override
		public void spinWheels() {
			System.out.println("Huuuuum");
		}

	}
	/*
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}

	}
	*/
}