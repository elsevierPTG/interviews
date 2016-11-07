package com.elsevier.education;

import com.elsevier.education.Exercise2.ElectricEngine;
import com.elsevier.education.Exercise2.Engine;
import com.elsevier.education.Exercise2.EngineFactory;
import com.elsevier.education.Exercise2.GasEngine;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

Creating a factory pattern to inject the type of engine
during the car creation time

*/
public class Exercise2 {

	public static class Car{
		
		private Engine engine = null;//marking private, as it will be initialized during the creation only
		
		/**
		 * @param engineType
		 * @throws IllegalArgumentException
		 */
		public Car(String engineType) throws IllegalArgumentException{
			this.engine = EngineFactory.getEngineType(engineType);
		}
		
		/**
		 * method for moving forward
		 */
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	
	
	interface Engine{
		public abstract void spinWheels();
	}
	static class GasEngine implements Engine{

		public void spinWheels() {
			System.out.println("Spin Wheels from Gas Engine");
		}
	}
	
	static class ElectricEngine implements Engine{
		public void spinWheels() {
			System.out.println("Spin Wheels from Electric Engine");
		}	
	}
	
	static class EngineFactory{
		public static  Engine getEngineType(String engineType) throws IllegalArgumentException{
			if(engineType.equals("E")){
				return new ElectricEngine();
			}
			else if(engineType.equals("G")){
				return new GasEngine();
			}
			else{
				throw new IllegalArgumentException("Invalid Engine type passedd");
			}
		}
	}
	
}