package com.elsevier.education;

public class Exercise4 {

	public static class Counter {

		private int count = 0;

		public synchronized int increment() {
			return ++count;
		}

		public int getCount() {
			return count;
		}

		public synchronized void resetCount() {
			count = 0;
		}

	}
}