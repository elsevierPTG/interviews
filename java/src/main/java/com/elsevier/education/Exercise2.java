package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

Added Engin interface
Added GasEngine, ElectricEngine and implements Engin interface.
*/
public class Exercise2 {
    interface Engin{
        void spinWheels();
    }
    public static class GasEngine implements Engin {
       public void spinWheels() {
           // no-op
       }
   }
    public static class ElectricEngine implements Engin {
        public void spinWheels() {
            // no-op
        }
    }
	public static class Car {

		private Engin engin;
		//Added new construction to set Engin interface
		public Car(Engin engin) {
		    this.engin = engin;
		}

		public void moveForward() {
		    engin.spinWheels();
		}
	}
}