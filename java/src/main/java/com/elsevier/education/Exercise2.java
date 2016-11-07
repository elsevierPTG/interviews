package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine gEngine;

		private ElectricEngine eEngine;

		private EngineFactory factory;
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
		
		//Dependency Injection
		public void setGasEngine(GasEngine gasEngine){
			this.gEngine= gasEngine;
		}

		public static EngineFactory engineFactory(String engine){
			
			if(engine=="Gas"){

			gEngine= new GasEngine();
				
			}else(engine=="electric"){
				eEngine= new ElectricEngine();
			}

		}

	}
	
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}

     public static class ElectricEngine {
		public void spinWheels() {
			// no-op for now
		}
	}


	public static class EngineFactory(){
		
		public abstract GasEngine getGasEngine();
		public abstract ElectricEngine getElectricEngine();
	
	}

}
