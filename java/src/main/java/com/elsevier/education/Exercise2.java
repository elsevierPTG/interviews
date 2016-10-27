package com.elsevier.education;

/**
 * TODO refactor the Car to use dependency injection of the engine
 * Answer: I used constructor injection
 * TODO allow use of either a gas engine or electric engine.
 * Answer: Same Engine interface can hold any child impl's
 * TODO make sure we have no-op implementations of both engines.
 * Answer: Implemented with simple message
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

    public static interface Engine {
        void spinWheels();
    }

    public static class GasEngine implements Engine {
        public void spinWheels() {
            System.out.println("Car running on Gas");
        }
    }

    public static class ElectronicEngine implements Engine {
        public void spinWheels() {
            System.out.println("Car running on Electric energy");
        }
    }

    public static void main(String[] args) {
        Car gasCar = new Car(new GasEngine());
        gasCar.moveForward();

        Car electricCar = new Car(new ElectronicEngine());
        electricCar.moveForward();
    }
}