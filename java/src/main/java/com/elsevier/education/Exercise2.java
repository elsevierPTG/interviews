package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/

public static void main(String[]){
	
}
	
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public interface Engine
		{
			public void spinWheels();
		}

		
		public Car(Engine car_engine) {
			egine = car_engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class Gas_Engine extends Engine
	{		
		public void spinWheels() 
		{
			//no-op
		}
	}
	public static class Elecric_Engine extends Engine
	{
		public voic spinWheels()
		{
			//no-op
		}
	}
}
