package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/

/*

Use abstraction for two types of engines and simple fatory pattern to choose engines

*/
public class Exercise2 {

	public class Car {
		
		public class Engine {
			public void spinWeels() {
			}
		}
		
		public class GasEngine extends Engine {}
		public class EleEngine extends Engine {}
		
		public class EngineSelector {
			Engine selectEngine(String type) {
				switch(type) {
					case "gas":
						return new GasEngine();
					case "electric":
						return new EleEngine();
					default:
						break;
				}
				return null;
			}
		}
		
		private EngineSelector engineSelector = null;
		private Engine engine = null;
		
		public Car() {
			engineSelector = new EngineSelector();
			engine = engineSelector.selectEngine("gas");
		}
		
		public Car(String type) {
			engineSelector = new EngineSelector();
			engine = engineSelector.selectEngine(type);
		}
		
		public void moveForward() {
			if (engine != null) {
				engine.spinWheels();
			}
		}
	}
	
}
