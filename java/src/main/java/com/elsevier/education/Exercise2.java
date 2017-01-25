package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car implements ElectricEngine{
		
		private GasEngine engine = new GasEngine();
		private ElectricEngine elEngine = new ElectricEngine():
		public Car(GasEngine engine, ElectricEngine elEngine) { 
			this.engine = engine;
			this.elEngine = elEngine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	 interface ElectricEngine{
		 void move();
	}
		
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}
