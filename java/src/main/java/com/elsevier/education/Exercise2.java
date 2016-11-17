package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		// Object for interface is declared. 
		//private GasEngine engine = new GasEngine();
		private Engine engine;
		// Instead of defualt consturctor, constructor with Interface - Engine object is declared to 
		// have dependency injection of Engine class into Car 				
		/*public Car() {
		}*/
		public car(Engine engine){
			if(engine instanceof GasEngine){
				this.engine = new GasEngine();
			}
			if(engine instanceof ElectricEngine){
				this.engine = new ElectricEngine();
			}
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	// New Interface Engine is added which can be implemented by both GasEngine and ElectricEngine
	public static interface Engine {
		public void spinWheels();					
	}
	//Modified GasEngine to implment Engine interface
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	// Added new class ElectricEngine which implements Engine interface
	public static class ElectricEngine implements Engine {	
		public void spinWheels() {
			// no-op for now
		}	
		
	} 
}
