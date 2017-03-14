package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		private Engine engine;
		
		// Need to pass Engine object need to be injected
		public Car(Engine e) {
			this.engine = e;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	//Both GasEngine and ElectricEngine implements Engine interface
	public static class GasEngine implements Engine{
		@Override
		public void spinWheels() {
			// no-op for now
			System.out.println("inside gas engine");
		}
	}
	
	public static class ElectricEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
			System.out.println("inside electric engine");
		}
	}
	
	//Created engine Interface
	public static interface Engine {
		public void spinWheels();
	}
	
	public static void main(String args[]) {
		Car car = new Car(new GasEngine());
		car.moveForward();
	}
}
