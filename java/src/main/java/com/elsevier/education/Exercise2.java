package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		//Removed engine initialization and defaults its null
		private GasEngine engine;
		
		// Constructor injection is introduced so that data member Engine gets initialized
		public Car(Engine engine) {
		 this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	//Class GasEngine are created which implements Engine interface
	public static class GasEngine implements Engine{
		//spinWheels() method in interface Engine will be called. As per java 8, we can write implementation logic in interface itself using "default" keyword.
		/*
		 For example:
		 public void moveForward() {
			engine.spinWheels(); // will call spinWheels() method in interface Engine
		}
		
		If we want separate implementation, then we required to override spinWheels() in this class
		 */
	}
	
	//Class ElectricEngine are created which implements Engine interface
	public static class ElectricEngine implements Engine {
		//spinWheels() method in interface Engine will be called. As per java 8, we can write implementation logic in interface itself using "default" keyword.
		/*
		 For example:
		 public void moveForward() {
			engine.spinWheels(); // will call spinWheels() method in interface Engine
		}
		
		If we want separate implementation, then we required to override spinWheels() in this class
		 */
	}
	
	//interface Engine is created
	public interface Engine {
		//As per java 8, we can write implementation logic in interface itself using "default" keyword.
		default void spinWheels() {
			// no-op for now
		}
	}
	
	public static void main(String[] args) {
		//Passing GasEngine reference
		Car carGasEngine = new Car(new GasEngine());
		carGasEngine.moveForward();

		//Passing ElectricEngine reference
		Car carElectricEngine = new Car(new ElectricEngine());
		carElectricEngine.moveForward();
	}
}
