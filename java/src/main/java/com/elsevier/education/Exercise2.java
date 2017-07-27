package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {
	public static void main(String[] args) {
		Car c = new Car();
		Engine e = new ElectricEngine();
		c.setEngine(e);
		c.moveForward();
	}

	public static class Car {
		
		private Engine engine;
		
		public Car() {
		}
		
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static abstract class Engine {
		abstract public void spinWheels();
	}
	
	public static class GasEngine extends Engine {
		public void spinWheels() {
			System.out.println("Running on gas");
		}
	}
	
	public static class ElectricEngine extends Engine {
		public void spinWheels() {
			System.out.println("Running on electricity");
		}
	}
}