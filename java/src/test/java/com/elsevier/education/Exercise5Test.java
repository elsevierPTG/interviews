package com.elsevier.education;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Tests for Exercise5 Singleton
 * 
 * @author Pradeep Prabhakar
 */
public class Exercise5Test {

	@Test
	public void testExercise5SingletonisSingleton() {
		Singleton firstInstance = Singleton.getInstance();

		for (int i = 0; i < 10; i++) {
			Singleton anotherInstance = Singleton.getInstance();
			assertEquals(true, firstInstance == anotherInstance);
		}
	}

	@Test
	public void testExercise5SingletonHasOnlyPrivateConstructors() {
		final Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			assertTrue(Modifier.isPrivate(constructor.getModifiers()));
		}
	}
}
