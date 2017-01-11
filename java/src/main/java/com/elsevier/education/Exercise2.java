package com.elsevier.education;

/**
TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine
*/
public class Exercise2{

	public static class Car{
		
		private Engine engine;
		
		//Injecting through constructor
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		//Injecting through Setter
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		
		public Engine getEngine() {
			return engine;
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
	
	public static class ElectricEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	
	
}