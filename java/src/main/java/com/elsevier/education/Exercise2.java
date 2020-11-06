package com.elsevier.education;

public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car() {
		}

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

		public void moveForward() {
			engine.spinWheels();
		}
	}

	public interface Engine{
        void spinWheels();
    }

    public static class GasEngine implements Engine {
        public void spinWheels() {
            // no-op for now
        }
    }

    public static class ElectricEngine implements Engine {
        public void spinWheels() {
            // no-op for now
        }
    }
