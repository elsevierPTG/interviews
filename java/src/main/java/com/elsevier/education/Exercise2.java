package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	 public static class Car {

        private SimpleEngine engine;

        public Car() {
        }

        public Car(SimpleEngine engine) {
            this.engine = engine;
        }

        public void moveForward() {
            engine.spinWheels();
        }
    }

        interface SimpleEngine {
            public void spinWheels();
        }

        public static class GasEngine implements SimpleEngine {
            public void spinWheels() {
            System.out.println("Using GasEngine");
            }
        }

        public static class ElectricEngine implements SimpleEngine

        {
            public void spinWheels () {
            System.out.println("Using ElectricEngine");
        }
        }

        public static void main(String args[]) {
            Car car = new Car(new GasEngine());
            car.moveForward();
            Car ElectricCar = new Car(new ElectricEngine());
            ElectricCar.moveForward();

	}
        }
