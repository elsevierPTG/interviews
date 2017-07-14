package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {

		private GasEngine engine = new GasEngine();
		private ElectricEngine  electrinEng = new ElectricEngine();

		public Car() {
		}

		public void moveForward() {
			if (gas) {
				engine.spinWheels();
			}else{
				electrinEng.spineWheel();
			}
		}

	}


	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine{
		public void spineWheel(){

		}
	}
}