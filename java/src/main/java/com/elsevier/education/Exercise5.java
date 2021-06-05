package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {

	public static class Singleton {
		/**
		 * A private static class to hold a single instance of the {@code Singleton}. This implementation
		 * will create a new instance of the class when it is loaded.
		 */
		private static final class Holder {
			static final Singleton INSTANCE = new Singleton();

			/**
			 * Return a reference to our one and only instance.
			 * @return our {@code Singleton}
			 */
			public static Singleton getInstance() {
				return Holder.INSTANCE;
			}
		}

		/**
		 * Do something interesting.
		 */
		private void doSomething() {
			System.out.println("Doing something....");
	    }

		/**
		 * Accessor function for {@code doSomething()}.
		 */
		public void doSomeThing() {
			// Defer to the singleton
			Holder.getInstance().doSomething();
		}
	}


	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}
