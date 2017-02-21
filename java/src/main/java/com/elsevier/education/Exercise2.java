package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine;
		private ElectricEngine eleEngine;
		public Car() {
		}
		public void setEngine(GasEngine engine){
			this.engine=engine;
		}		
		public void setEleEngine(ElectricEngine eleEngine){
			this.eleEngine=eleEngine;
		}
		public void moveForward() {
			engine.spinWheels();
		}
	}
	public abstract class Engine{
			public void spinWheels();
		
	}
	public static class GasEngine extends Engine{
		public void spinWheels() {
			// no-op for now
			System.out.println("inside GasEngine spinWheels() method");
		}
	}
	public class ElectricEngine extends Engine{
		public void spinWheels(){
			//no-op for now
			System.out.println("inside Electric engine spinWheels() method");
		}
	}
}
