package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

   Created the Engine interface for abstraction and two implementations EngineGas and EngineElectric.
   Dependency Injection via constructor, resulting in two instances of the Car class. 

*/
public class Exercise2 {

	public static class Car {
		private Engine engine;
		
		public Car(Engine engine) {
			this.engine=engine;
		}

		public Engine getEngine() {
			return engine;
		}
		/*private GasEngine engine = new GasEngine();
		
		public Car() {
		}*/
		
		public void moveForward() {
			engine.spinWheels();
		}
		
		public interface Engine {
			void spinWheels();
		}
		
		public static class EngineGas implements Engine {
			@Override
			public void spinWheels() {
				System.out.println("****In gas engine****");
			}
		}
	
		public static class EngineElectric implements Engine {
			@Override
			public void spinWheels() {
				System.out.println("***In electric engine***");
			}
		}
	
		public static void main(String... args) {
			new Car(new EngineGas()).moveForward();
			new Car(new EngineElectric()).moveForward();
		}
	}
}