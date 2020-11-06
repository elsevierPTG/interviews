package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine

1. Have argument for Engine interface

TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)

1. Create interface

TODO make sure we have no-op implementations of the gas engine and electric engine

1. Create two implementations

*/

public class Exercise2 {

	public static class Car {
		
		private Engine engine; //just setup the needed interface
		
		public Car(Engine engine) { //have the calling code inject which implementation
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public interface Engine {
		public void spinWheels(){};
	}

	public static class GasEngine implements Engine {
		public void spinWheels(){
			//whatever needs done to start a gas engine: verify gas tank has gas, start ignition, put into gear, etc...	
		}
	}

	public static class ElectricEngine implements Engine {
		public void spinWheels(){
			//whatever needs done to start an electric engine: verify battery has enough voltage, etc...
		}
	}
}
