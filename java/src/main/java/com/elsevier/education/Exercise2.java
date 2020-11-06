package com.elsevier.education;

import org.springframework.beans.factory.annotation.Autowired;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

Note: Since I have no idea how to use Gradle, I did not know how
to add the dependency for Spring as that's the only way I know 
to have dependency injection.  I know you can also do it with Struts
and EJB but I don't know those well at all.  I imported the package for the Spring
Autowired annotation and used that for  the setter to set the Engine.  
Without the Autowired annotation and some sort of bean factory, it's not true 
dependency injection as the pattern is defined.  I created a separate constructor
and a getter and setter, I changed the field to be an Engine instead of 
a GasEngine and created an interface Engine to accommodate. 

*/
public class Exercise2
{
	public static class Car
	{
		private Engine mObjEngine;
		
		public Car()
		{ }
		
		public Car(final Engine objEngine)
		{
			setEngine(objEngine);
		}
		
		public Engine getEngine()
		{
			return(mObjEngine);
		}
		
		public void moveForward()
		{
			engine.spinWheels();
		}
		
		@Autowired
		public void setEngine(final Engine objEngine)
		{
			mObjEngine = objEngine;
		}
	}
	
	public interface Engine
	{
		public void spinWheels();
	}
	
	public static class GasEngine implements Engine
	{
		public void spinWheels()
		{
			System.out.println("Spinning Gas Engine Wheels");
		}
	}
	
	public static class ElectricEngine implements Engine
	{
		public void spinWheels()
		{
			System.out.println("Spinning Electric Engine Wheels");
		}
	}
}