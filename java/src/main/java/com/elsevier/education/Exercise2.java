package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine gasEngine = new GasEngine();
		private ElectricEngine electricEngine = new ElectricEngine();
		
		public Car() {
		}
		
		public Car(GasEngine gasEngine) {  
 			this.gasEngine = gasEngine;   
		} 
		
		public Car(ElectricEngine electricEngine) {  
 			this.electricEngine = electricEngine;   
 		} 	
				
		public void moveForward() {
			gasEngine.spinWheels();
			electricEngine.spinWheels();
		}
	}
	
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}
