package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

1. created the parent abstract Engine class with abstract spinWheels method
2. created the child class GasEngine and implemented it's own spinWheeels method.
3. created the child class ElectricEngine and implemented it's own spinWheeels method.
4. modified the car constructor as argument based on constructor, that will allow the car object to be created with type of engine through dependency injection
5. Also provided the setter method to set engine, if we create the Car object through no-arg constructor.

　
　
*/
public class Exercise2 {
	
	
	public class Car {
		
		private Engine engine = null;
		
		public Car(){
			
		}
				
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public Engine getEngine() {
			return engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	abstract public class Engine{
		public abstract void spinWheels();
	}
	
	public class GasEngine extends Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public class ElectircEngine extends Engine{
		public void spinWheels() {
			// no-op for now
		}

	}

}
