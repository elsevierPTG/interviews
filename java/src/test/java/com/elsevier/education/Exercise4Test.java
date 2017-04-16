package com.elsevier.education;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.elsevier.education.Exercise4.Counter;

public class Exercise4Test {

	@Test
	public void testCounter() {
		Counter counter = new Counter();
		assertEquals(0, counter.getCount());
		counter.increment();
		assertEquals(1, counter.getCount());
		for (int i = 0; i < 100; i++) {
			counter.increment();
		}
		assertEquals(101, counter.getCount());
		counter.resetCount();
		assertEquals(0, counter.getCount());
	}
}
