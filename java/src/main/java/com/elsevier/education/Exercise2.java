package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	
	public static class Car {
			private Engine engine;			
			public Car(Engine e) {
				this.engine = e;
			}
			public void moveForward() {
				engine.spinWheels();
			}
		}
	
		public static class GasEngine implements Engine{
			@Override
			public void spinWheels() {
				// no-op for now
				System.out.println("inside gas engine");
			}
		}
		
		public static class ElectricEngine implements Engine{
			@Override
			public void spinWheels() {
				// no-op for now
				System.out.println("inside electric engine");
			}
		}
	public static interface Engine{
			public void spinWheels();
		}
	public static void main(String args[])
	{
		Car car = new Car(new GasEngine());
		car.moveForward();
	} 
}
