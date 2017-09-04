package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	/**
	 * Augmented Car 
	 * 
	 * @author Rai Singh
	 * 
	 * Recruiter: Linda Pham, Jobspring Partners
	 *
	 */
	public static class Car {
		
		/**
		 * Inject using interface
		 */
		private Engine engine;
		
		/**
		 * No-args constructor needed to identify class as POJO
		 */
		public Car() {			
		}
		
		public Engine getEngine() {
			return engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}		
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	
	public static class GasEngine implements Engine{

		public void spinWheels() {
			//no-op
		}		
	}
	
	public static class ElectricEngine implements Engine{

		public void spinWheels() {
			//no-op
		}		
	}
	
	public interface Engine {
		public void spinWheels();
	}
}