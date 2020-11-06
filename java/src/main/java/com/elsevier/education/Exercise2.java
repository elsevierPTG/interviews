package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/

/*created interface so the gas/electric engines can access its method
*initialized methods of gas/electric to return no-op
*possible to pass in both electric and gas engine
*used this implementation as it seems the most straightforward in accomplish the task
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
