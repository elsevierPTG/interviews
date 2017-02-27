package com.elsevier.education;

/**
Candidate : Jin W. Chen
Email : JinWChen@yahoo.com
recruiter :
Linda Pham | Technical Recruiter
JOBSPRING PHILADELPHIA 
Office: (267) 765-6100

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	public abstract static class Engine {
		abstract void spinWheels();
	}
	
	public static class GasEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
}
