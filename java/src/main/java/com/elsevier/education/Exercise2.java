package com.elsevier.education;

/**
 * 
 * Created the Engine interface and two concrete implementations; GasEngine and ElectricEngine.
 * Used constructor injection to inject the aforementioned concrete implementations, resulting in two instances of the Car class. 
 * 
 * @author JFracassi
 *
 */
public class Exercise2 {
	
	public static class Car {
		
		private Engine engine;
		
		public Car(Engine engine) {
			this.engine=engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
		
	}
	
	public interface Engine {
		void spinWheels();
	}

	public static class GasEngine implements Engine {
		@Override
		public void spinWheels() {
			System.out.println("Spinning wheels with gas engine...");
		}
	}
	
	public static class ElectricEngine implements Engine {
		@Override
		public void spinWheels() {
			System.out.println("Spinning wheels with electric engine...");
		}
	}
	
	public static void main(String... args) {
		new Car(new GasEngine()).moveForward();
		new Car(new ElectricEngine()).moveForward();
	}
}