package com.elsevier.education;    
/**    
TODO refactor the Car to use dependency injection of the engine  
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)  
TODO make sure we have no-op implementations of the gas engine and electric engine    
*/  
public class Exercise2 {     
	public static class Car {        
		private Engine engine;       
		public Car(Engine e) {                      
			engine = e;
   		}        
		public void moveForward() {     
			engine.spinWheels();    
		}  
	} 
   	public static abstract class Engine {    
		public abstract void spinWheels();  
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
