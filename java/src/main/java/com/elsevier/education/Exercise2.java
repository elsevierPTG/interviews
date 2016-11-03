package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		@Autowired
		@Qualifier("gasEngine") // if want electricEngine, can wire that object here
		public Engine setEngine(Engine engine1){
			engine = engine1;
		}		
		
		public Engine getEngine(){
			return engine;
		}
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	interface Engine{
		spinWheels();
	}
	@Component("gasEngine")
	public class GasEngine implements Engine {
		@override
		public void spinWheels() {
			System.out.println("GasEngine spinWheels---------->");
			// no-op for now
		}
	}
	
	@Component("electricEngine")
	public class ElectricEngine implements Engine {
		@override
		public void spinWheels() {
			System.out.println("ElectricEngine spinWheels---------->");
			// no-op for now
		}
	}
}
