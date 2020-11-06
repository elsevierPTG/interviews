package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {
	/**
	
	 * Create interface IEngine with void method "spinWheels"<br>
	 * Create ElectricEngine class that implements IEngine, along with the method<br>
	 * Implement IEngine for GasEngine class as well along with the method<br>
	 * Change instance variable type in Car class to be IEngine without any instantiation<br>
	 * In Car constructor, add the parameter IEngine and set the instance field for dependency injection<br>
	 * The steps above allows appropriate abstraction through dependency injection because IEngine can either be
	 * GasEngine or ElectricEngine in which will define the Car class by the injected dependency.
	
	 */

	public static class Car {
		
		
		//private GasEngine engine = new GasEngine();
		private IEngine engine;
		
		public Car(IEngine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public interface IEngine {
		void spinWheels();
	}
	
	public static class GasEngine implements IEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine implements IEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}