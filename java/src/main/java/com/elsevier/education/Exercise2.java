package com.elsevier.education;

/**

 In order to abstract the type of engine in a Car class, we need an interface Engine which will allow us to inject
 either a GasEngine or ElectricEngine class. We would then create Car as a @Component and use @Autowired to inject the
 desired type of engine.

 @Bean
 public Car gasCar() {
     Engine power = new GasEngine();
     power.setSound("Vroooom");
    return gasCar; 
 }

 @Bean
 public Car electricCar () {
     Engine power = new ElectricEngine();
     power.setSound("Mmmmmmmmm");
 }

 In this example, I've used setter injection to wire in a GasEngine implementation. We could also change that to
 electricCar.

 @Autowired
 public void setEngine(Engine electricCar) {
 this.engine = electricEngine;
 }

 So engine type is now decoupled from the Car class.
*/


public class Exercise2 {

	public static class Car {
		
		private Engine engine;

		// Commented out @Autowired since this example is not a Spring implementation.
		//@Autowired
		public void setEngine(Engine gasCar) {
			this.engine = gasCar;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	/**
	 * We need an interface so we can refer to either a GasEngine or an ElectricEngine class
	 */
	public interface Engine {

		public void spinWheels(String sound);

		public void spinWheels(); // no op

		public void setSound(String sound);

	}


	public static class GasEngine implements Engine {

	    String sound;

		@Override
		public void spinWheels(String sound) {
			System.out.println(sound);
		}

        @Override
        public void spinWheels() { }

        @Override
        public void setSound(String sound) {

		    this.sound = sound;
        }

    }

	public static class ElectricEngine  implements Engine {

        String sound;

        @Override
        public void spinWheels(String sound) {
            System.out.println(sound);
        }

        @Override
        public void spinWheels() {
        }

        @Override
        public void setSound(String sound) {

                this.sound = sound;
        }

	}

}