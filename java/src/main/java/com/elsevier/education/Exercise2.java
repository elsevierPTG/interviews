package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		//Added the Engine interface reference to use the dependency injection
		private Engine engine;
		//Pass the Engine reference in the constructor
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	//Added another class for Electric engine
	public static class ElectricEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	//Added Engine interface to acheive Abstraction
	public interface Engine{
		public void spinWheels();
	}
	//Used main method to access the GasEngine class methods
	public static void main(String args[]){
		Car c = new Car(new GasEngine());
		c.moveForward();
	}				
	
}
