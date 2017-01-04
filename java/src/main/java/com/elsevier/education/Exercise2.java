package com.elsevier.education;

public class Exercise2 {
	
	public static class Car {
		private Engine engine;
        /** here we provide a Car constructor that allows dependency injection of the engine **/
		public Car (Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
    /** make an abstract Engine class **/
	public static abstract class Engine {
        // ensures concrete implementations have a spinWheels() implementation 
		public abstract void spinWheels();
	}
	public static class GasEngine extends Engine {

		@Override
		public void spinWheels() {
			// TODO no-op
			
		}
		
	}
	public static class Electric extends Engine {

		@Override
		public void spinWheels() {
			// TODO no-op
			
		}
		
	}
}

