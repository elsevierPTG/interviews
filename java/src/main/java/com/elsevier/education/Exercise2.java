package com.elsevier.education;


/**
TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine
*/

/**
 * In this, we are injecting the dependencies using constructor  
 *	To set the engine, we are using Factory Pattern to get the object based on input .
 * @author Safura
 *
 */
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		private String type;
		
		// Constructor based injection
		public Car(String type) {
			this.type = type;
			this.engine = FactoryUtil.getEngine(type);
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public interface Engine {
		public void spinWheels();
	}
	
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	/**
	 * Implemneted Factory Pattern to get the engine instance
	 * @author Safura
	 *
	 */
	public static class FactoryUtil{
		public static Engine getEngine(String type){
			Engine engine = null;
			if("GAS".equalsIgnoreCase(type)){
				engine = new GasEngine();
			}else if("ELECTRIC".equalsIgnoreCase(type)){
				engine = new ElectricEngine();
			}
			return engine;
			
		}
	}
}