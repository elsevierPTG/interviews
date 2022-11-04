package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		@Autowired
		private GasEngine engine
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static abstract class Engine{
		public  final  void spinWheels(){
			// TODO Auto-generated method stub
		}
	}
public static class GasEngine extendts Engine {
		
	}
	public static class ElectricEngine extendts Engine {
		
	}
}