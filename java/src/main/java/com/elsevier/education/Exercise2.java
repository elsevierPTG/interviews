package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private static final GasEngine gEngine = new GasEngine();
		private static final ElectricEngine eEngine= new ElectricEngine();
		
		public Car(GasEngine gEngine) {
			this.gEngine=gEngine;
		}
		
		public Car(ElectricEngine eEngine){
			this.eEngine=eEngine;
		
		
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
	public static class ElectricEngine{
	
		public void spinWheels(){
		//no-op for now
	}
	}
	
	

	

	

	
}












