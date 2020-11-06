package com.elsevier.education;

/**
TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine
     The Purpose of this class is to use dependency injection using class as Abstract Class or by using Interface 
*/
public class Exercise2 {
	
	public interface Car{
		void moveForward();
	}

	public class GasEngine implements Car{
		private GasEngine engine = new GasEngine();
		@Override
		public void moveForward() {
			// TODO Auto-generated method stub
			engine.spinWheels();
			
		}
		
		public void spinWheels() {
			// no-op for now
		}
		
	}

	public class ElectricEngine implements Car{

		@Override
		public void moveForward() {
			// TODO Auto-generated method stub
			
		}
		
	}
}

