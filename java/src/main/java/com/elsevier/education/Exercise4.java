package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter implements Runnable{

		private static int count = 0;

		synchronized public int increment() {
			System.out.println(Thread.currentThread().getName()+" "+count);

			return ++count;
		}
		public void run(){
			while(count<=5000){
				increment();
			}
		}

		public int getCount() {
			return count;
		}

		public void resetCount() {
			count = 0;
		}

		public void main(String arg[]){
			Countre c = new Counter();
			Thread t1 = new Thread(c);
			Thread t2 = new Thread(c);

			t2.start();
			t1.start();

		}

	}
}