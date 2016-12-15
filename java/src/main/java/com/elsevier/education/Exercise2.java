package com.elsevier.education;

/**

 NOTE: Usage of Spring Framework is assumed

 Steps to accomplish dependency injection

 1) Create interface for Engine
        - Default implementation is no-op
 2) Create Gas and Electric implementations of Engine interface
 3) Annotate implementation classes (GasEngine, ElectricEngine, Car) to
    be components
        - Assuming the application is set up to component scan the
          package the components are in, spring will create managed
          versions of these classes within the spring container, allowing
          them to be candidates for dependency injection
 4) Enable constructor injection within Car
        - Deliberately done over field injection, as constructor injection
          allows class to be more easily unit tested

 @author Joseph Cosentino
*/
public class Exercise2 {

    @Component
	public static class Car {
		
		private Engine engine;

		@Autowired
		public Car(Engine engine) {
		    this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	public interface Engine {

	    default void spinWheels() {
	        // default, no-op implementation
        }

    }

    @Component
	public static class GasEngine implements Engine {

	}

	@Component
    public static class ElectricEngine implements Engine {

    }
}