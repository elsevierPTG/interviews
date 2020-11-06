package com.elsevier.education;

/**
 * The purpose of this class is to implement thread-safe Counter by using synchronized
*/
	public class Counter implements Runnable{
		
		private static int count = 0;
		
		public static synchronized int increment() {
			System.out.println(Thread.currentThread().getName() + ": " + count);
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

		@Override
		public void run() {
			while(count<1000){
				increment();
	          }
		}
		
		public static void main(String[] args) {
			Counter t = new Counter();
	          Thread thread1 = new Thread(t);
	          Thread thread2 = new Thread(t);

	          thread1.start();
	          thread2.start();          
	     }
	}
