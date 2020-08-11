package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	/* For our engine abstraction, we could either make a class to be extended, or an interface.
	   Since we want no-op implementations of the engines, and we are presuming for now they will be used by the car in the same way,
	   a class is more appropriate */

	public static class Engine {
		public Engine() {
		}

		public String spinWheels(){
			//For testing
			return "Spinning wheels!";
		}
	}

	//Now we'll make gas and electric engine classes that extend Engine
	public static class GasEngine extends Engine {
		public GasEngine(){
			super();
		}
	}

	public static class ElectricEngine extends Engine {
		public ElectricEngine(){
			super();
		}
	}

	public static class Car {
		
		//Our car will have an engine, the type of which will be injected in during creation
		private Engine engine;
		
		public Car(Engine e) {
			engine = e;
		}
		
		public String moveForward() {
			return engine.spinWheels()+" Moving forward!";
		}

		public String getEngineType(){
			return engine.getClass().getSimpleName();
		}
	}

	//This is one way we'd see the dependency injection in action
	public static class CarFactory{
		
		public static Car GasCar(){
			return new Car(new GasEngine());
		}

		public static Car ElectricCar(){
			return new Car(new ElectricEngine());
		}
	}
}