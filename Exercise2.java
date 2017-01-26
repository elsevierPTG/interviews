package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car implements EngineService{
		
		private Engine engine;
		
		public Car() {
		}
		public void setEngine(Engine newEngine){
			engine=newEngine;
		}
		public void moveForward() {
			engine.spinWheels();
		}
		public Engine gasEngine(){
			Engine gas=null;
			// code
			return  gas ;
		};
		public Engine electricEngine(){
			Engine electric=null;
			// code
			return electric;
		};
	}
	public interface EngineService {
	Engine gasEngine();
	Engine electricEngine();
	}
	public static class Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
}