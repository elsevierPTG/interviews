package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private static Engine engine;
				
		public Car(Engine engine) {
			this.engine=engine;
			
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	public abstract class Engine{
	public abstract void spinWheels();
	}
	public static class GasEngine extends Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class ElectricEngine extends Engine{
	public void spinWheels(){
	//np-op for npw
	}
	}
	
}
