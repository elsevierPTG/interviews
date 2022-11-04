package com.elsevier.education;

/*
 *1. Car can use the dependency injection of Engine by setter and getter methods of Engine
 *2. Either GasEngine or ElectricEngine can be used by providing an Interface called Engine
 *3. Implementation of GasEngine and ElectricEngine is provided by extending the Engine Interface and by overriding the method 
 */
public class Exercise2 {
	public static class Car {
		
		private Engine engine;
		
		public Car() {
			
		}
		
		public void moveForward() {
			engine.spinWheels();
		}

		public Engine getEngine() {
			return engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		
		
	}
	
	public static class GasEngine implements Engine{

		@Override
		public void spinWheels() {
			System.out.println("This is GasEngine");
			
		}
		
	}
	
	public static class ElectricEngine implements Engine {

		@Override
		public void spinWheels() {
			System.out.println("This is ElectricEngine");
			
		}
		
	}
	
	public interface Engine {
		public void spinWheels();
	}
}
