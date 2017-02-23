package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

See below
*/
import static java.lang.System.out;

public class Exercise2 {

	public static class Car {
		
		// use setter for parent class
		private static Engine engine;
		
		//  or constructor to inject Engine instance
		public Car(Engine newEngine) {
			engine = newEngine;
		}
		
		// setter, parameter is abstract (parent) class
		public static void setEngine(Engine newEngine) {
				engine = newEngine;
		}
	
		public static void moveForward() {
			engine.spinWheels();
		}
	}
	
	// implement GasEngine for Engine
	public static class GasEngine extends Engine {
		
		public GasEngine() {}
		
		@Override
		public void spinWheels() {
			out.println("Uses gasoline for propulsion");
		}
	}
	
	// implement ElectricEngine for Engine
	public static class ElectricEngine extends Engine {
		
		public ElectricEngine() {}
			
		@Override
		public void spinWheels() {
			out.println("Uses electricity for propulsion");
		}
	}
	
	// abstract parent class
	public static abstract class Engine {
			// implement spinWheels method
			public abstract void spinWheels();
	}
			
	// show for both
	public static void main(String...inputs) {
		// inject the ElectricEngine child object into Car
		Car.setEngine(new ElectricEngine());
		Car.moveForward();	
		// inject the GasEngine child object into Car
		Car.setEngine(new GasEngine());
		Car.moveForward();
	}

}