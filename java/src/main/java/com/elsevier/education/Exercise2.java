package com.elsevier.education;

/**
 * 
 * This class is modified to have an interface, so that GasEngine and Electric Engine functions can be implemented accordingly and injected when necessary for Car object.
 * 
 * @author Mukul Das 
 * Email: m.das001@yahoo.com
 * Recruiter: Collabera
 * 
 * 
 */
public class Exercise2 {
		public static class Car {
				
				private Engine engine ;
				
				public Car(Engine eng) {
					this.engine = eng;
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
			
			public interface Engine{
				public  void   spinWheels() ;
			}
}
