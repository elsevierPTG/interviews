package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		//private GasEngine engine = new GasEngine();
		@Autowired
		private GasEngine engine;
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	public abstract class Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class GasEngine extends Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class ElectricEngine extents Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
}
