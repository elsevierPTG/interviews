package com.elsevier.education;

/**
 * TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 *
 * The counter is not thread-safe in this example. FOllowing code suggestions
 * can fix it.
 */
public class Exercise4 {

    public static class Counter {
	/*
	 * There are two ways we can make the variable count thread-safe.
	 *
	 * 1. By declaring the private int count to be AtomicInteger, instead of
	 * just int. AtomicInteger by definition guarantees atomicity, i.e an
	 * operation acting on a shared memory is atomic if it completes in a
	 * single step relative to other threads.
	 *
	 * 2. by making the getter and setter methods for count to be
	 * synchronized.
	 */
	// private AtomicInteger count;
	private int count = 0;

	public int getCount() {
	    return this.count;
	}

	synchronized public int increment() {
	    return ++this.count;
	}

	synchronized public void resetCount() {
	    this.count = 0;
	}

    }
}