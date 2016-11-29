package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.
You can create a gas Engine object, or electric Engine and inject to the constructor.
*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car(Engine engine) {
			this.engine = engine;
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
	public interface Engine {
		void spinWheels();
	}
}