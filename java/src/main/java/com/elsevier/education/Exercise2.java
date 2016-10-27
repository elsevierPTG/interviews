package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
	
		private Engine engine = null;
		
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public  class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public  class ElectricEngine implements Engine{
	  public void spinWheels(){
		  // no-op for now
	  }
	}
	public  interface Engine{
		public void spinWheels();
	}
	
}
