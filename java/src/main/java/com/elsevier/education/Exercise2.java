package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
	//used constructor Dependency injection	
		
	private Engine engine;	
	//One way to set dependencies is to pass the concrete implementation of the depending class to the constructor.
	       public Car(Engine engine)
	       {
		     this.engine;
	       }		

		public void moveForward()
		{
			engine.spinWheels();
		}
	}
	//created an interface Engine to get a level of abstraction
	public interface Engine
        {   
		public void spinwheels();
        }


	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	//created a class called ElectricEngine to so that the car class can use both Gas and Electric engine
       public static class ElectricEngine implements Engine {
                public void spinWheels() {
			// no-op for now
		}
	}
}	

