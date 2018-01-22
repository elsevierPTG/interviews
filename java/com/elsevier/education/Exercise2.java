package com.elsevier.education;

/**

allow use of either a gas engine or electric engine (create an appropriate abstraction)
make sure we have no-op implementations of the gas engine and electric engine

DHS: Added  no-op implementations  electric engine
DHS: Added  Autowired GasEngine for Spring DI

*/
public class Exercise2 {

	public static class Car {
		
		@Autowired
		private GasEngine engine;
		
		public void setEngine(GasEngine engine) {
			this.engine = engine;
		}

		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
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

}