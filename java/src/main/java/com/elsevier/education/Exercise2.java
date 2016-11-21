package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine = new GasEngine();
		
		public Car(GasEngine engine) {
			this.engine=new Engine();
		}
		public Cat(ElectricEngine engine){
			this.engine=new Engine();
		}
		
		

		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	Interface Engine{
		spinWheels(){}
	}
	public static class GasEngine implements Engine {
		public void spinWheels() {
			System.Out.println("this is GasEngine...");
		}
	}
	
	
public class ElectricERngine implements Engine{
public void spinWheels(){
	System.out.println("this is Electric Engin...");
}
}
}
