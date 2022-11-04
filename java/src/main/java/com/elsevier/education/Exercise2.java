package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

 Created an Engine interface
 Added Constructor taking an Engine interface for dependecy injection.


*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine;
		
		public Car(Engine engine) {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	public interface Engine {
		void spinWheels();
	}

	public static class GasEngine implements Engine {
		@Override
		public void spinWheels() {
			System.out.println("Gas Engine: Spinning Wheels... Vroom");
		}
	}

	public static class ElectricEngine implements Engine {
		@Override
		public void spinWheels() {
			System.out.println("Electric Engine: Spinning Wheels... Whurrr");
		}
	}

}