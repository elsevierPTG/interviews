package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {
	Public Interface Engine{
		default void sprinWheels(); 
	}
public static class GasEngine implements Engine {}
	
	public static void main(String args[]){
		Car car=new car(new GasEngine());
		car.moveForward();
	

	public static class Car {
		private final Engine engine;
		private GasEngine engine = new GasEngine();
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}
