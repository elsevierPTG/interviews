package com.elsevier.education;


public class Exercise2 {

	/**
	 * created Engine interface. GasEngine and ElectricEngine implements Engine
	 * Car class taks Engine as constructor object( dependency injection)
	 * Now either GasEngine or ElectricEngine instance can be injected into Car instance during object creation time.
	 */
	public static interface Engine{
		void spinWheels();
	}
	public static class GasEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class ElectricEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class Car {
		
		private Engine engine;
		
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	
}
