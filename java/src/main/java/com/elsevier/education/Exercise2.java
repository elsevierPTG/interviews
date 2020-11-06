package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
1- Here we will create engine interface and Car could use either GasEngine or ElectricEngine at runtime through dependancy injection.

TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
1- Here we will use factroty design pattern so that we could hide the implementaion logic from user

TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {
	
	/* 
	We use this interface so that Car class could use the polymorphic implentation .
	This is program through interface and its loosely coupled.
	*/
	interface Engine{
		void spinWheels();
	}
	
	
	public class CarFactory {

		   //use getEngine method to get object of type Engine 
		   public Engine getEngine(String engineType){
		      if(engineType == null){
			 return null;
		      }		
		      if(engineType.equalsIgnoreCase("GAS")){
			 return new GasEngine();

		      } else if(shapeType.equalsIgnoreCase("ELECTRIC")){
			 return new ElectricEngine();

		      } 
		      return null;
		   }
	}
	
	public static class Car {
		
		//private GasEngine engine = new GasEngine();
		
		 CarFactory carFactory = new CarFactory();
		
		 //get an object of GASEngine and call its spinWheels method.
      		Engine engine = carFactory.getEngine("GAS");
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
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
}
