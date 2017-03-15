package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {

	/**
	 * The generally accepted way of implementing a singleton is by
	 * defining an enum with a single instance. This prevents multiple instances
	 * from being created.
	 * <p>
	 * An alternative is to define a private constructor and define a private
	 * static singleton instance. The instance is returned when getInstance is called.
	 * <p>
	 * The enum implementation has additional advantages that I don't recall.
	 */
	public static enum Singleton {

		INSTANCE;

		public static Singleton getInstance() {
			return INSTANCE;
		}

		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static class SingletonAlt {

		private static final SingletonAlt INSTANCE = new SingletonAlt();

		private SingletonAlt() {
		}

		public static SingletonAlt getInstance() {
			return INSTANCE;
		}

		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
