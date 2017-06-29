package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car extends Engine {
		
		// private GasEngine engine = new GasEngine();



		public Car();


		@Override
		public void spinWheels() {

		}

		public void moveForward() {
			spinWheels();
		}
	}

	public enum EngineType {
		GasEngine,
		ElectricEngine
	}

	public abstract class Engine{


		EngineType engineType = null;
		public  Engine (EngineType type){
			this.engineType = type;
		};


		public abstract void spinWheels();
	}
}