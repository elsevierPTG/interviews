package com.company;

/**
 * Created by Yash Gupta
 */
public class Exercise2 {

    public static class Car {

        private GasEngine gasEngine;
        private ElectricEngine electricEngine;


        public Car(GasEngine engineType, ElectricEngine electricEngine) {
            this.gasEngine = engineType;
            this.electricEngine = electricEngine;
        }

        public void moveForward() {
            gasEngine.spinWheels();
        }
    }

    public class GasEngine implements EngineType{
        public void spinWheels() {
            // no-op for now
        }
    }

    public class ElectricEngine implements EngineType{
        public void spinWheels(){
            // no-op for now
        }
    }

    public interface EngineType{
        public void spinWheels();
    }
}
