package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {
 	
 	public interface Engine{
 		default void spinWheels(){// Engine interface created since it was missing implementation 
 			//no-op for now
 		}
 	}
  
  	public static class Car {
		
		private GasEngine engine = new GasEngine();
		
		public Car() {
			private final Engine engine;
 			public Car(Engine engine){
 			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine implements Engine {  // Gas Engine implementing the interface methods 
		public void spinWheels() {
			// no-op for now
		}
		 	}
 	public static class ElectricEngine implements Engine {  // ElectricEngine implementing the interface methods 
		public void spinWheels() {
			// no-op for now
		}
 	}
 	
 	public static void main(String[] args) {
 		Car carGasEngine = new Car(new GasEngine()); 
 		carGasEngine.moveForward();
 		
 		Car carElectricEngine = new Car(new ElectricEngine());
 		carElectricEngine.moveForward();
  	}
	
}
